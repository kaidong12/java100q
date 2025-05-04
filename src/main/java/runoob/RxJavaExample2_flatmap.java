package runoob;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RxJavaExample2_flatmap {
	public static void main(String[] args) {

		/*
		 * flatMap 是 RxJava 中非常强大且常用的操作符, 它用于将 Observable 发射的每个数据项转换为一个新的 Observable,
		 * 并将这些 Observable 的结果“扁平化”为一个单一的 Observable。
		 * 
		 * flatMap 的核心在于它的“扁平化”能力，可以将嵌套的 Observable展开为一个单一的流。
		 * 
		 * flatMap 的核心功能之一就是将嵌套的 Observable（即 Observable<Observable<T>>）“扁平化”为一个单层的
		 * Observable<T>。 这种能力使得 flatMap 非常适合处理复杂的异步任务和数据流，尤其是当任务之间存在嵌套或依赖关系时。
		 * 
		 * ===============flatMap 的扁平化能力===============
		 * 
		 * 假设你有一个 Observable，它发射的每个数据项本身也是一个 Observable， 也即意味着它是一个异步函数调用。
		 * 那么, flatMap 会将这些内部的 Observable 合并为一个单一的、扁平化的 Observable。 
		 * 这样，你就可以处理一个连续的数据流，而不是嵌套的数据流。
		 * 
		 */

		System.out.println("===============flatMapDemo1===============");
		demo1();
		System.out.println("===============flatMapDemo2===============");
		demo2();
		System.out.println("===============flatMapDemo3===============");
		demo3();
		System.out.println("===============flatMapDemo4===============");
		demo4();
		System.out.println("===============concatMapDemo1===============");
		demo5();
		System.out.println("===============concatMapDemo2===============");
		demo6();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 从数据库获取用户信息并获取其订单
	// 假设我们有一个 UserService，可以获取用户信息，还有一个 OrderService，可以根据用户 ID 获取其订单。
	// 我们需要将用户信息和订单信息结合起来。
	private static void demo1() {
		// 模拟获取用户信息
		Observable<User> users = Observable.fromIterable(Arrays.asList(new User(1, "Alice"), new User(2, "Bob")));

		// 使用 flatMap 获取每个用户的订单
		users.map(user -> OrderService.getOrders(user.getId()))
				.subscribe(orders -> System.out.println("Received Orders(map): " + orders));

		users.flatMap(user -> OrderService.getOrders(user.getId()))
				.subscribe(orders -> System.out.println("Received Orders(flatMap): " + orders));
	}

	// 从网络获取数据并处理结果
	// 假设我们有一个 ApiService，可以异步获取数据，我们希望对每个数据项进行进一步处理。
	private static void demo2() {
		// 模拟从网络获取数据
		Observable<List<String>> dataStream = Observable.fromCallable(() -> Arrays.asList("Data1", "Data2", "Data3"))
				.subscribeOn(Schedulers.io());

		dataStream.map(dataList -> Observable.fromIterable(dataList)).map(data -> "Processed-demo2: " + data)
				.subscribe(result -> System.out.println("map-demo2 --> Received: " + result));

		// 使用 flatMap 处理每个数据项
		dataStream.flatMap(dataList -> Observable.fromIterable(dataList)).map(data -> "Processed: " + data)
				.subscribe(result -> System.out.println("flatMap-demo2 --> Received: " + result));
	}

	// 处理嵌套的异步任务
	// 假设我们有两个异步任务，第二个任务依赖于第一个任务的结果。flatMap 是处理这种嵌套异步任务的理想选择。
	private static void demo3() {
		// 第一个异步任务：获取用户 ID
		Observable<Integer> userIdStream = Observable.fromCallable(() -> {
			System.out.println("Fetching user ID...");
			TimeUnit.SECONDS.sleep(1); // 模拟异步操作
			return 123;
		}).subscribeOn(Schedulers.io());

		// 第二个异步任务：根据用户 ID 获取用户信息
		userIdStream.flatMap(userId -> getUserInfo(userId))
				.subscribe(userInfo -> System.out.println("Received User Info--demo3: " + userInfo));

	}

	// 模拟获取用户信息
	static Observable<String> getUserInfo(int userId) {
		return Observable.fromCallable(() -> {
			System.out.println("Fetching user info for user ID-demo3: " + userId);
			TimeUnit.SECONDS.sleep(1); // 模拟异步操作
			return "User Info for ID-demo3: " + userId;
		}).subscribeOn(Schedulers.io());
	}

	// 处理多个异步任务的结果
	// 假设我们有多个异步任务，每个任务返回一个结果，我们希望将所有结果合并为一个列表。
	private static void demo4() {
		// 创建一个包含多个异步任务的 Observable
		Observable.just(1, 2, 3).flatMap(id -> fetchData(id)) // 每个 ID 对应一个异步任务
				.toList() // 将所有结果合并为一个列表
				.subscribe(results -> System.out.println("Received Results-demo4: " + results));
	}

	// 模拟异步任务
	static Observable<String> fetchData(int id) {
		return Observable.fromCallable(() -> {
			System.out.println("Fetching data for ID-demo4: " + id);
			TimeUnit.SECONDS.sleep(1); // 模拟异步操作
			return "Data for ID-demo4: " + id;
		}).subscribeOn(Schedulers.io());
	}

	/*
	 * concatMap 是 RxJava 中的一个操作符，它的行为与 flatMap 类似，但处理数据流的方式有所不同。 concatMap 会将
	 * Observable 发射的每个数据项转换为一个新的 Observable，然后按顺序将这些 Observable 的结果合并为一个单一的
	 * Observable。
	 * 
	 * flatMap：将多个 Observable 的结果“扁平化”为一个单一的 Observable，但不会保证顺序。如果内部的 Observable
	 * 发射数据的时间不同，它们的结果可能会交错出现。
	 * 
	 * concatMap：同样将多个 Observable 的结果合并为一个单一的 Observable，但会按顺序发射每个内部 Observable
	 * 的结果，不会交错。
	 * 
	 */

	// 示例 1：按顺序处理多个异步任务
	// 假设我们有一个用户列表，每个用户对应一个异步任务，我们希望按顺序处理这些任务的结果。
	private static void demo5() {
		// 创建一个用户列表
		Observable.just("Alice", "Bob", "Charlie").concatMap(name -> fetchData(name)) // 每个用户对应一个异步任务
				.subscribeOn(Schedulers.io()) // 在 IO 线程中执行
				.subscribe(result -> System.out.println("Received-demo5: " + result));
	}

	// 模拟异步任务
	static Observable<String> fetchData(String name) {
		return Observable.fromCallable(() -> {
			System.out.println("Fetching data for-demo5: " + name);
			TimeUnit.SECONDS.sleep(1); // 模拟网络延迟
			return "Data for-demo5: " + name;
		});
	}

	// 示例 2：按顺序处理多个数据流
	// 假设我们有多个数据流，每个数据流包含多个数据项，我们希望按顺序处理这些数据流的结果。
	private static void demo6() {
		// 创建一个包含多个数据流的 Observable
		Observable
				.just(Observable.just("A1-demo6", "A2-demo6"), Observable.just("B1-demo6", "B2-demo6"),
						Observable.just("C1-demo6", "C2-demo6"))
				.concatMap(innerObservable -> innerObservable) // 按顺序处理每个数据流
				.subscribe(System.out::println);
	}

	static class User {
		private int id;
		private String name;

		public User(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}
	}

	static class OrderService {
		public static Observable<List<String>> getOrders(int userId) {
			// 模拟从数据库获取订单
			switch (userId) {
			case 1:
				return Observable.just(Arrays.asList("Order1", "Order2"));
			case 2:
				return Observable.just(Arrays.asList("Order11", "Order22"));
			}
			return Observable.just(Arrays.asList("Order111", "Order222"));
		}
	}
}
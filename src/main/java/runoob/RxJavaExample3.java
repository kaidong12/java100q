package runoob;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RxJavaExample3 {
	public static void main(String[] args) {

		/*
		 * flatMap 是 RxJava 中非常强大且常用的操作符, 它用于将 Observable 发射的每个数据项转换为一个新的 Observable,
		 * 并将这些 Observable 的结果“扁平化”为一个单一的 Observable。
		 * 
		 * flatMap 的核心在于它的“扁平化”能力，可以将嵌套的 Observable展开为一个单一的流。
		 * 
		 * flatMap 的核心功能之一就是将嵌套的 Observable（即 Observable<Observable<T>>）“扁平化”为一个单层的 Observable<T>。
		 * 这种能力使得 flatMap 非常适合处理复杂的异步任务和数据流，尤其是当任务之间存在嵌套或依赖关系时。
		 * 
		 * ===============flatMap 的扁平化能力===============
		 * 
		 * 假设你有一个 Observable，它发射的每个数据项本身也是一个 Observable，
		 * 那么 flatMap 会将这些内部的 Observable 合并为一个单一的、扁平化的 Observable。
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
		Observable<List<String>> dataStream = Observable.fromCallable(() -> Arrays.asList("Data1", "Data2", "Data3"));
//				.subscribeOn(Schedulers.io());

		dataStream.map(dataList -> Observable.fromIterable(dataList)).map(data -> "Processed: " + data)
				.subscribe(result -> System.out.println("map --> Received: " + result));

		// 使用 flatMap 处理每个数据项
		dataStream.flatMap(dataList -> Observable.fromIterable(dataList)).map(data -> "Processed: " + data)
				.subscribe(result -> System.out.println("flatMap --> Received: " + result));
	}

	// 处理嵌套的异步任务
	// 假设我们有两个异步任务，第二个任务依赖于第一个任务的结果。flatMap 是处理这种嵌套异步任务的理想选择。
	private static void demo3() {
		// 第一个异步任务：获取用户 ID
		Observable<Integer> userIdStream = Observable.fromCallable(() -> {
			System.out.println("Fetching user ID...");
			TimeUnit.SECONDS.sleep(1); // 模拟异步操作
			return 123;
		});
		// .subscribeOn(Schedulers.io());

		// 第二个异步任务：根据用户 ID 获取用户信息
		userIdStream.flatMap(userId -> getUserInfo(userId))
				.subscribe(userInfo -> System.out.println("Received User Info: " + userInfo));

	}

	// 模拟获取用户信息
	static Observable<String> getUserInfo(int userId) {
		return Observable.fromCallable(() -> {
			System.out.println("Fetching user info for user ID: " + userId);
			TimeUnit.SECONDS.sleep(1); // 模拟异步操作
			return "User Info for ID: " + userId;
		});
		// .subscribeOn(Schedulers.io());
	}

	// 处理多个异步任务的结果
	// 假设我们有多个异步任务，每个任务返回一个结果，我们希望将所有结果合并为一个列表。
	private static void demo4() {
		// 创建一个包含多个异步任务的 Observable
		Observable.just(1, 2, 3).flatMap(id -> fetchData(id)) // 每个 ID 对应一个异步任务
				.toList() // 将所有结果合并为一个列表
				.subscribe(results -> System.out.println("Received Results: " + results));
	}

	// 模拟异步任务
	static Observable<String> fetchData(int id) {
		return Observable.fromCallable(() -> {
			System.out.println("Fetching data for ID: " + id);
			TimeUnit.SECONDS.sleep(1); // 模拟异步操作
			return "Data for ID: " + id;
		});
		// .subscribeOn(Schedulers.io());
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
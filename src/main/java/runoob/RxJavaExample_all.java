package runoob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RxJavaExample_all {

	public static void main(String[] args) {
		System.out.println("===============justDemo===============");
		justDemo();
		System.out.println("===============mapDemo===============");
		mapDemo();
		System.out.println("===============flatMapDemo===============");
		flatMapDemo();
		flatMapDemo2();
		System.out.println("===============flatMapIterableDemo===============");
		flatMapIterableDemo();
		System.out.println("===============filterDemo===============");
		filterDemo();
		System.out.println("===============mergeDemo===============");
		mergeDemo();
		System.out.println("===============zipDemo===============");
		zipDemo();
		System.out.println("===============concatDemo===============");
		concatDemo();
		System.out.println("===============subscribeOnDemo===============");
		subscribeOnDemo();
//		System.out.println("===============observeOnDemo===============");
//		observeOnDemo();
	}

	// just 是一个静态方法
	// 用于创建一个只发射单个数据项的 Observable
	public static void justDemo() {
		// 创建一个只发射单个数据项的 Observable
		Observable.just("Hello, RxJava!").subscribe(data -> System.out.println("Received: " + data));
	}

	// map 是一个转换操作符
	// 用于对 Observable 发射的每个数据项进行转换，返回一个新的数据项。
	public static void mapDemo() {
		Observable.just("Alice", "Bob", "Charlie").map(name -> name.toUpperCase()) // 将每个名字转换为大写
				.subscribe(data -> System.out.println("Received: " + data));
	}

	// flatMap 是一个强大的操作符
	// 用于将 Observable 发射的每个数据项转换为一个新的 Observable
	// 然后将这些 Observable 的结果合并为一个单一的 Observable。
	public static void flatMapDemo() {
		Observable.just("Alice", "Bob", "Charlie").flatMap(name -> Observable.just(name.length())) // 将每个名字转换为长度
				.subscribe(data -> System.out.println("Received(flatMap): " + data));
	}

	public static void flatMapDemo2() {
		Observable.just("Alice", "Bob", "Charlie").map(name -> Observable.just(name.length())) // 将每个名字转换为长度
				.subscribe(data -> System.out.println("Received(map): " + data));
	}

	// flatMapIterable 是一个操作符
	// 用于将 Observable 发射的单个数据项转换为一个可迭代的集合（如 List 或 Iterable），并将集合中的每个元素展开为独立的事件。
	public static void flatMapIterableDemo() {
		// 创建一个用户列表，每个用户包含多个订单
		List<User> users = new ArrayList<>();
		users.add(new User("Alice", List.of("Order1", "Order2")));
		users.add(new User("Bob", List.of("Order3")));
		users.add(new User("Charlie", List.of("Order4", "Order5")));

		// 使用 flatMapIterable 将每个用户的订单展开为独立的事件
		Observable.fromIterable(users).flatMapIterable(user -> user.getOrders()) // 展开每个用户的订单
				.subscribe(order -> System.out.println("Received Order: " + order));
	}

	// filter 是一个筛选操作符
	// 用于根据条件过滤 Observable 发射的数据项，只保留满足条件的数据。
	public static void filterDemo() {
		Observable.just(1, 2, 3, 4, 5).filter(number -> number % 2 == 0) // 筛选出偶数
				.subscribe(data -> System.out.println("Received: " + data));
	}

	// merge 是一个组合操作符
	// 用于将多个 Observable 的结果合并为一个单一的 Observable。
	// 它会交错发射各个 Observable 的数据项。
	public static void mergeDemo() {
		Observable<Integer> observable1 = Observable.just(1, 2, 3);
		Observable<Integer> observable2 = Observable.just(4, 5, 6);

		Observable.merge(observable1, observable2) // 合并两个 Observable
				.subscribe(data -> System.out.println("Received: " + data));
	}

	// zip 是一个组合操作符
	// 用于将多个 Observable 的数据项按顺序组合成一个新的数据项。它会等待所有 Observable 发射数据后，再进行组合。
	// 如果某个 Observable 提前结束，zip 也会结束。
	public static void zipDemo() {
		Observable<Integer> observable1 = Observable.just(1, 2, 3);
		Observable<String> observable2 = Observable.just("A", "B", "C");

		Observable.zip(observable1, observable2, (number, letter) -> number + "--" + letter) // 组合数据
				.subscribe(data -> System.out.println("Received: " + data));
	}

	// concat 是一个组合操作符
	// 用于将多个 Observable 的结果按顺序合并为一个单一的 Observable。
	// 它会依次发射各个 Observable 的数据项。
	public static void concatDemo() {
		Observable<Integer> observable1 = Observable.just(1, 2, 3);
		Observable<Integer> observable2 = Observable.just(4, 5, 6);

		Observable.concat(observable1, observable2) // 按顺序合并两个 Observable
				.subscribe(data -> System.out.println("Received: " + data));
	}

	// fromCallable 是一个静态方法
	// 用于从一个 Callable 创建一个 Observable。Callable 是一个可以返回值的函数式接口，通常用于执行一些计算或异步任务。
	//
	// 当你需要从一个可能抛出异常的计算或异步任务中创建 Observable 时，fromCallable 是一个很好的选择。.
	//
	// 假设我们有一个方法 fetchDataFromNetwork，它可能抛出异常，我们希望将其结果包装为 Observable
	// fromCallable 接受一个 Callable，并将其结果包装为 Observable。
	// 如果 Callable 抛出异常，Observable 会通过 onError 发射异常。
	public static void fromCallableDemo() {
		// 创建一个 Observable，从 Callable 中获取数据
		Observable<String> observable = Observable.fromCallable(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// 模拟网络请求
				Thread.sleep(2000);
				return "Data from network";
			}
		});

		// 订阅并处理结果
		observable.subscribeOn(Schedulers.io()) // 在 IO 线程中执行
				.subscribe(data -> System.out.println("Received: " + data),
						error -> System.out.println("Error: " + error.getMessage()));
	}

	// subscribeOn 是一个操作符
	// 用于指定 Observable 的上游任务（如数据源或计算任务）在哪个线程中执行。它通常用于将任务切换到后台线程。
	//
	// subscribeOn 指定 Observable 的上游任务在指定的调度器中执行。
	// 它的作用范围是整个 Observable 流，无论在何处调用，都会影响整个流的执行线程。
	public static void subscribeOnDemo() {
		// 创建一个 Observable，模拟耗时任务
		Observable.just("Hello, RxJava!").map(data -> {
			// 模拟耗时操作
			Thread.sleep(2000);
			return data.toUpperCase();
		}).subscribeOn(Schedulers.io()) // 指定在 IO 线程中执行
				.subscribe(
						result -> System.out
								.println("Received: " + result + " (Thread: " + Thread.currentThread().getName() + ")"),
						error -> System.out.println("Error: " + error.getMessage()));
	}

	// observeOn 是一个操作符
	// 用于指定 Observable 的下游任务（如数据处理或 UI 更新）在哪个线程中执行。
	// 它通常用于将任务切换到主线程（如在 Android 中更新 UI）。
	//
	// observeOn 指定 Observable 的下游任务在指定的调度器中执行。
	// 它的作用范围是调用点之后的部分，可以多次调用以切换线程。
	public static void observeOnDemo() {
		// 创建一个 Observable，模拟耗时任务
		Observable.just("Hello, RxJava!").map(data -> {
			// 模拟耗时操作
			Thread.sleep(2000);
			return data.toUpperCase();
		}).subscribeOn(Schedulers.io()) // 在 IO 线程中执行耗时任务
				.observeOn(AndroidSchedulers.mainThread()) // 切换到主线程更新 UI
				.subscribe(result -> tvResult.setText(result),
						error -> tvResult.setText("Error: " + error.getMessage()));
	}

	static class User {
		private String name;
		private List<String> orders;

		public User(String name, List<String> orders) {
			this.name = name;
			this.orders = orders;
		}

		public List<String> getOrders() {
			return orders;
		}
	}
}

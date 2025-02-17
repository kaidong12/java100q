package runoob;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RxJavaExample5_subscribeOn {
	public static void main(String[] args) {

		/*
		 * subscribeOn 是 RxJava 中一个非常重要的操作符，用于指定 Observable
		 * 的上游任务（即数据源或计算任务）在哪个线程中执行。它允许你将耗时的计算或异步任务切换到后台线程，从而避免阻塞主线程（例如在 Android 中的 UI
		 * 线程）。
		 */

		System.out.println("===============subscribeOn Demo0===============");
		demo0();
		System.out.println("===============subscribeOn Demo1===============");
		demo1();
		// System.out.println("===============subscribeOn Demo2===============");
		// demo2();

	}

	private static void demo0() {

		Observable.create(new ObservableOnSubscribe<Object>() {

			@Override
			public void subscribe(@NonNull ObservableEmitter<@NonNull Object> emitter) throws Throwable {
				// 主动创建并发射事件
				System.out.println("subscribe... " + Thread.currentThread());

				// 模拟网络请求
				Thread.sleep(2000);

				emitter.onNext("aaa");
				emitter.onNext("bbb");
				emitter.onNext("ccc");
				emitter.onComplete();

			}
//		}).subscribeOn(Schedulers.io()) // 用来指定Observable的subscribe（）方法执行的线程，也就是产生事件发射事件所在的线程
		}).subscribeOn(Schedulers.newThread()) // 用来指定Observable的subscribe（）方法执行的线程，也就是产生事件发射事件所在的线程
//		.observeOn(AndroidSchedulers.mainThread()); // 指定下游事件被处理时所处的线程
				.map(new Function<Object, Object>() {

					@Override
					public @NonNull Object apply(@NonNull Object t) throws Throwable {
						return "subscribeOn 会指定执行线程为后台线程， 必须通过 observeOn 切换回主线程。 （只有在Android项目中才有AndroidSchedulers.mainThread()的概念！！！）";
					}

				}).subscribe(new Observer<Object>() {

					@Override
					public void onSubscribe(@NonNull Disposable d) {
						// TODO Auto-generated method stub
						System.out.println("---onSubscribe--- " + Thread.currentThread());
					}

					@Override
					public void onNext(@NonNull Object t) {
						// TODO Auto-generated method stub
						System.out.println("---onNext--- " + Thread.currentThread());
						System.out.println("---onNext--- " + t.toString());
					}

					@Override
					public void onError(@NonNull Throwable e) {
						// TODO Auto-generated method stub
						System.out.println("---onError--- " + Thread.currentThread());
					}

					@Override
					public void onComplete() {
						// TODO Auto-generated method stub
						System.out.println("---onComplete--- " + Thread.currentThread());
					}

				});

	}

	// 示例 1：在 IO 线程中执行耗时任务
	// 假设我们有一个耗时的计算任务，我们希望在后台线程中执行，以避免阻塞主线程。
	private static void demo1() {
		Observable.just("Hello, RxJava!").map(data -> {
			// 模拟耗时操作
			System.out.println("Processing in thread: " + Thread.currentThread().getName());
			return data.toUpperCase();
		}).subscribeOn(Schedulers.io()) // 指定在 IO 线程中执行
				.subscribe(result -> System.out.println("Received: " + result));

		System.out.println("主线程已经执行到后面了: " + Thread.currentThread().getName());
		System.out.println("这就是异步执行，子线程不会阻塞主线程: " + Thread.currentThread().getName());
		// 防止主线程退出
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 示例 2：在 Android 中使用 subscribeOn
	// 在 Android 开发中，subscribeOn 常用于将网络请求或数据库操作切换到后台线程，以避免阻塞 UI 线程。
	private static void demo2() {

//	private TextView tvResult;
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//
//		tvResult = findViewById(R.id.tvResult);
//
//		Observable.just("Hello, RxJava!").map(data -> {
//			// 模拟耗时操作
//			Thread.sleep(2000);
//			return data.toUpperCase();
//		}).subscribeOn(Schedulers.io()) // 在 IO 线程中执行耗时任务
//				.observeOn(AndroidSchedulers.mainThread()) // 切换到主线程更新 UI
//				.subscribe(result -> tvResult.setText(result));
	}

}
package runoob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class RxJavaExample1_create {
	public static void main(String[] args) {

		// 创建Observable最原始形态
		Observable.create(new ObservableOnSubscribe<Object>() {

			@Override
			public void subscribe(@NonNull ObservableEmitter<@NonNull Object> emitter) throws Throwable {
				// 主动创建并发射事件
				System.out.println("subscribe... " + Thread.currentThread());

				emitter.onNext("aaa");
				emitter.onNext("bbb");
				emitter.onNext("ccc");
				emitter.onComplete();

			}
		}).subscribe(observer2);

		// 创建Observable
		Observable<String> observable = Observable.create(emitter -> {
			emitter.onNext("Hello");
			emitter.onNext("World");
			emitter.onNext("emitter");
			emitter.onComplete();
		});

		// 定义Observer
		Observer<String> observer1 = new Observer<String>() {
			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("onSubscribe-1, Subscribed --> " + d.getClass());
			}

			@Override
			public void onNext(String s) {
				System.out.println("onNext-1, Received: " + s);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("onError-1, Error: " + e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("onComplete-1, Completed");
			}
		};

		// 订阅
		observable.subscribe(observer1);

		Observable.just("1", "a", "xxx", "just1").subscribe(observer1);
		Observable.just(1, "a", "xxx", "just2").subscribe(observer2);
		Observable.fromArray(1, "a", "xxx", "yyy", "nnn", "fromArray").subscribe(observer2);

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("fromIterable");
		Observable.fromIterable(list1).subscribe(observer2);

		Observable.fromCallable(new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				return "call from Callable";
			}
		}).subscribe(observer2);
	}

	static Observer<Object> observer2 = new Observer<Object>() {

		@Override
		public void onSubscribe(@NonNull Disposable d) {
			System.out.println("onSubscribe-2 --> " + d.toString());
		}

		@Override
		public void onNext(@NonNull Object t) {
			System.out.println("onNext-2..." + t.toString());
		}

		@Override
		public void onError(@NonNull Throwable e) {
			System.out.println("onError-2..." + e.toString());
		}

		@Override
		public void onComplete() {
			System.out.println("onComplete-2...");
		}
	};
}
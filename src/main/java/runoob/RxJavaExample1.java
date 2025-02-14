package runoob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class RxJavaExample1 {
	public static void main(String[] args) {
		// 创建Observable
		Observable<String> observable = Observable.create(emitter -> {
			emitter.onNext("Hello");
			emitter.onNext("World");
			emitter.onNext("emitter");
			emitter.onComplete();
		});

		// 定义Observer
		Observer<String> observer = new Observer<String>() {
			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Subscribed");
			}

			@Override
			public void onNext(String s) {
				System.out.println("Received: " + s);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Error: " + e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("Completed");
			}
		};

		// 订阅
		observable.subscribe(observer);

		Observable.just("1", "a", "xxx", "just1").subscribe(observer);
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

	static Observer observer2 = new Observer<Object>() {

		@Override
		public void onSubscribe(@NonNull Disposable d) {
			System.out.println("onSubscribe..." + d.toString());
		}

		@Override
		public void onNext(@NonNull Object t) {
			System.out.println("onNext..." + t.toString());
		}

		@Override
		public void onError(@NonNull Throwable e) {
			System.out.println("onError..." + e.toString());
		}

		@Override
		public void onComplete() {
			System.out.println("onComplete...");
		}
	};
}
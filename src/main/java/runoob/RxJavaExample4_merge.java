package runoob;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RxJavaExample4_merge {
	public static void main(String[] args) {

		/*
		 * concat 和 merge 是 RxJava 中用于合并多个 Observable 的操作符。 它们都可以将多个 Observable
		 * 的结果合并为一个单一的 Observable，但在处理数据流时的行为有所不同。以下是它们的详细用法和区别。
		 * 
		 */

		System.out.println("===============concat Demo===============");
		demo1();
		System.out.println("===============merge Demo===============");
		demo2();

	}

	// concat 的用法
	// concat 用于按顺序合并多个 Observable 的结果。它会等待前一个 Observable 完成后，再开始处理下一个
	// Observable，因此结果是按顺序发射的，不会交错。
	private static void demo1() {
		Observable<String> observable1 = Observable.just("A1", "A2", "A3");
		Observable<String> observable2 = Observable.just("B1", "B2", "B3");

		// 使用 concat 合并两个 Observable
		Observable.concat(observable1, observable2).subscribe(data -> System.out.println("Received: " + data));
	}

	// merge 的用法
	// merge 用于合并多个 Observable 的结果，但它不会等待前一个 Observable 完成，而是会交错发射各个 Observable
	// 的结果。因此，merge 的结果可能会交错出现。
	private static void demo2() {
		Observable<String> observable1 = Observable.fromArray("A1", "A2", "A3", "A1", "A2", "A3", "A1", "A2", "A3",
				"A1", "A2", "A3");
		Observable<String> observable2 = Observable.fromArray("B1", "B2", "B3", "B1", "B2", "B3", "B1", "B2", "B3",
				"B1", "B2", "B3");

		// 使用 merge 合并两个 Observable
		Observable.merge(observable1, observable2).subscribe(data -> System.out.println("Received: " + data));
	}

}
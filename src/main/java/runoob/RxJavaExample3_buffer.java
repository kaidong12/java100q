package runoob;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RxJavaExample3_buffer {
	public static void main(String[] args) {

		/*
		 * buffer 是 RxJava 中的一个非常实用的操作符 用于将 Observable
		 * 发射的数据项收集到一个缓冲区中，并按照指定的规则批量发射这些数据项。 这在处理数据流时非常有用，尤其是当你需要将数据分批处理时。
		 * 
		 */

		System.out.println("===============bufferDemo1===============");
		demo1();
		System.out.println("===============bufferDemo2===============");
		demo2();
		System.out.println("===============bufferDemo3===============");
		demo3();

	}

	// 基本形式：按固定数量分批
	// 最简单的形式是按固定数量的数据项分批。
	// buffer(int count) 会将数据项收集到一个列表中，当列表中的数据项数量达到指定的 count 时，将该列表作为一批数据发射出去。
	private static void demo1() {
		Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9).buffer(3) // 每3个数据项分一批
				.subscribe(batch -> System.out.println("Batch: " + batch));
	}

	// 按时间分批
	// buffer 还可以按时间分批，即每隔指定的时间间隔将缓冲区中的数据项作为一批发射出去。
	// buffer(long timespan, TimeUnit unit) 会每隔指定的时间间隔将缓冲区中的数据项发射出去。
	private static void demo2() {
		Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9).buffer(2, TimeUnit.SECONDS) // 每2秒分一批
				.subscribe(batch -> System.out.println("Batch: " + batch));

		// 等待足够的时间以观察输出
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 按数量和时间分批
	// buffer 还可以结合数量和时间分批，即每隔指定的时间间隔或当缓冲区中的数据项数量达到指定数量时，将缓冲区中的数据项发射出去。
	// buffer(long timespan, TimeUnit unit, int maxSize)
	// 会每隔指定的时间间隔或当缓冲区中的数据项数量达到指定数量时，将缓冲区中的数据项发射出去。
	private static void demo3() {
		Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9).buffer(2, TimeUnit.SECONDS, 3) // 每2秒或每3个数据项分一批
				.subscribe(batch -> System.out.println("Batch: " + batch));

		// 等待足够的时间以观察输出
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
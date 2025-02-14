package runoob;

import java.util.Arrays;
import java.util.List;

//简化线程和回调：
//Lambda表达式可以简化线程的创建和事件处理。
public class LambdaExample3 {
	/*
	 * Lambda表达式（Lambda Expression）是Java 8引入的一个重要特性，它允许你以一种简洁的方式表示匿名函数。
	 * Lambda表达式可以被看作是一个匿名内部类的简化形式，特别适用于单方法接口（Functional Interface）的实现。
	 * 通过Lambda表达式，你可以更方便地编写函数式编程风格的代码，提高代码的可读性和可维护性。
	 */
	public static void main(String[] args) {

		// 使用Lambda表达式创建线程
		System.out.println("使用Lambda表达式创建线程");
		new Thread(() -> System.out.println("Thread is running...")).start();

		// 使用Lambda表达式
		// 给button添加点击事件监听器
//		Button btn_1 = findViewById(R.id.btn1);
//		btn_1.setOnClickListener(v -> System.out.println("Button clicked!"));
		System.out.println();

		// 使用Lambda表达式实现回调
		System.out.println("=====无参数的Lambda表达式=====");
		interface Callback {
			void onEvent();
		}

		final class TempClass implements Callback {
			@Override
			public void onEvent() {
				System.out.println("使用临时类实现回调!");
			}
		}
		System.out.println();
		new TempClass().onEvent();

		Callback callback1 = () -> System.out.println("使用Lambda表达式实现回调 1!");
		callback1.onEvent();
		System.out.println();

		System.out.println("=====带参数的Lambda表达式=====");
		interface Callback2 {
			void onEvent(String msg);
		}
		Callback2 callback2 = (msg) -> System.out.println("使用Lambda表达式实现回调 2! --> " + msg);
		callback2.onEvent("args");
		System.out.println();

		System.out.println();
		System.out.println("=====forEach Lambda表达式=====");
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.forEach(name -> System.out.println("Hello, " + name));

		System.out.println();
		System.out.println("=====嵌套Lambda表达式=====");
		names.forEach(name -> runCallback(name, (msg) -> System.out.println("Hello, " + msg)));

	}

	/*
	 * 在Java中，函数（方法）体内不能直接定义另一个函数（方法）。
	 * 
	 * Java是一种面向对象的编程语言，它要求所有方法必须定义在类的上下文中，而不能嵌套定义方法。
	 * 这与一些支持嵌套函数定义的函数式编程语言（如Python、JavaScript等）不同。
	 * 
	 */

	public static void runCallback(String name, Callback3 callback) {
		callback.onEvent(name);
	}

	interface Callback3 {
		void onEvent(String msg);
	}

}

package runoob;

import java.util.Arrays;
import java.util.List;

//作为方法参数：
//许多Java标准库中的方法（如Runnable、Comparator、Consumer等）接受单方法接口作为参数，Lambda表达式可以方便地实现这些接口。
public class LambdaExample2 {

	/*
	 * Lambda表达式（Lambda Expression）是Java 8引入的一个重要特性，它允许你以一种简洁的方式表示匿名函数。
	 * Lambda表达式可以被看作是一个匿名内部类的简化形式，特别适用于单方法接口（Functional Interface）的实现。
	 * 通过Lambda表达式，你可以更方便地编写函数式编程风格的代码，提高代码的可读性和可维护性。
	 */
	public static void main(String[] args) {
		// 使用Lambda表达式实现Runnable接口
		Runnable runnable = () -> System.out.println("Running...");
		new Thread(runnable).start();

		// 使用Lambda表达式实现Comparator接口
		List<String> names = Arrays.asList("Alice", "Charlie", "Bob");
		names.sort((s1, s2) -> s1.compareTo(s2));
		System.out.println(names);

	}

}

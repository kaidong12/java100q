package runoob;

//实现单方法接口：
//通过Lambda表达式实现接口的抽象方法。
public class LambdaExample1 {
	/*
	 * Lambda表达式（Lambda Expression）是Java 8引入的一个重要特性，它允许你以一种简洁的方式表示匿名函数。
	 * Lambda表达式可以被看作是一个匿名内部类的简化形式，特别适用于单方法接口（Functional Interface）的实现。
	 * 通过Lambda表达式，你可以更方便地编写函数式编程风格的代码，提高代码的可读性和可维护性。
	 */
	public static void main(String[] args) {
		// 定义一个单方法接口
		@FunctionalInterface
		interface SimpleFunctionalInterface {
			void execute();
		}

		// 使用Lambda表达式实现接口
		SimpleFunctionalInterface sfi = () -> System.out.println("Hello, Lambda!");
		sfi.execute();

		// 定义一个单方法接口
		@FunctionalInterface
		interface SimpleFunctionalInterface2 {
			void execute(String name);
		}

		// 使用Lambda表达式实现接口
		SimpleFunctionalInterface2 sfi2 = (name) -> System.out
				.println(new StringBuilder().append("Hello, ").append(name).append(" Lambda!"));
		sfi2.execute("Java");

	}
}

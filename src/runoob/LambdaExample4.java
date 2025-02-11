package runoob;

//使用Lambda表达式作为函数参数
public class LambdaExample4 {
	/*
	 * Lambda表达式（Lambda Expression）是Java 8引入的一个重要特性，它允许你以一种简洁的方式表示匿名函数。
	 * Lambda表达式可以被看作是一个匿名内部类的简化形式，特别适用于单方法接口（Functional Interface）的实现。
	 * 通过Lambda表达式，你可以更方便地编写函数式编程风格的代码，提高代码的可读性和可维护性。
	 */
	public static void main(String[] args) {
		System.out.println("使用匿名内部类作为参数");
		int result1 = performOperation(10, 5, new MathOperation() {
			@Override
			public int operate(int x, int y) {
				return x + y;
			}
		});
		System.out.println("Addition Result: " + result1); // 输出：Addition Result: 15

		int result2 = performOperation(10, 5, new MathOperation() {
			@Override
			public int operate(int x, int y) {
				return x - y;
			}
		});
		System.out.println("Subtraction Result: " + result2); // 输出：Subtraction Result: 5

		int result3 = performOperation(10, 5, new MathOperation() {
			@Override
			public int operate(int x, int y) {
				return x * y;
			}
		});
		System.out.println("Multiplication Result: " + result3); // 输出：Multiplication Result: 50

		int result4 = performOperation(10, 5, new MathOperation() {
			@Override
			public int operate(int x, int y) {
				return x / y;
			}
		});
		System.out.println("Division Result: " + result4); // 输出：Division Result: 2
		System.out.println();

		System.out.println("使用Lambda表达式作为参数");
		int result11 = performOperation(10, 5, (a, b) -> a + b);
		System.out.println("Addition Result: " + result11); // 输出：Addition Result: 15

		int result21 = performOperation(10, 5, (a, b) -> a - b);
		System.out.println("Subtraction Result: " + result21); // 输出：Subtraction Result: 5

		int result31 = performOperation(10, 5, (a, b) -> a * b);
		System.out.println("Multiplication Result: " + result31); // 输出：Multiplication Result: 50

		int result41 = performOperation(10, 5, (a, b) -> a / b);
		System.out.println("Division Result: " + result41); // 输出：Division Result: 2
	}

	/*
	 * 在Java中，函数（方法）体内不能直接定义另一个函数（方法）。
	 * 
	 * Java是一种面向对象的编程语言，它要求所有方法必须定义在类的上下文中，而不能嵌套定义方法。
	 * 这与一些支持嵌套函数定义的函数式编程语言（如Python、JavaScript等）不同。
	 * 
	 */

	@FunctionalInterface
	interface MathOperation {
		int operate(int x, int y);
	}

	// 定义一个方法，接受MathOperation作为参数
	public static int performOperation(int x, int y, MathOperation operation) {
		return operation.operate(x, y);
	}
}

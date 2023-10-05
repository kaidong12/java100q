package runoob;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World"); // 输出 Hello World

		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80 };

		for (int x : numbers) {
			System.out.println(x);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("The value of i is: " + i);
		}

	}

}

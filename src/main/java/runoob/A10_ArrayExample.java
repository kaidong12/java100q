package runoob;

public class A10_ArrayExample {

	public static void main(String[] args) {
		int[] test = { 1, 2, 4, 5, 7 };
		for (int i : test) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		test = A10_ArrayExample.reverse(test);
		for (int i : test) {
			System.out.print(i + " ");
		}
	}

	public static int[] reverse(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0, j = result.length - 1; i < arr.length; i++, j--) {
			result[j] = arr[i];
		}
		return result;
	}
}

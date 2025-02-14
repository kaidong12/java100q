package runoob;

public class A07_Try_Catch {
	public static void main(String[] args) {
		System.out.println(test());
	}

	public static int test() {
		int i = 0;
		try {
			System.out.println("In test 1");
			i = 1;
			return i;
		} catch (Exception e) {
			System.out.println("2");
			i = 2;
			return i;
		} finally {
			i = 3;
			System.out.println("3");
//			return 3;
//			return i;
		}
	}
}
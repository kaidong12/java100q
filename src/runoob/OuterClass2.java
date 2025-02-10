package runoob;

public class OuterClass2 {
	public void showInner() {
		// 方法的局部变量
		final int localData = 20;

		// 局部内部类（Local Inner Class）
		class LocalInnerClass {
			public void display() {
				System.out.println("Local data: " + localData);
			}
		}

		// 创建局部内部类对象
		LocalInnerClass localInner = new LocalInnerClass();
		localInner.display();
	}

	/*
	 * 局部内部类是定义在方法内部的类。它只能在定义它的方法内部使用，不能在方法外部访问。
	 * 局部内部类可以访问方法的参数和局部变量，但这些变量必须是final的（在Java 8及以后，可以是“实际上的final”，即变量的值在方法中不会被修改）。
	 * */
	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		outer.showInner();
	}
}
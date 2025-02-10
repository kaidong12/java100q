package runoob;

public class OuterClass4 {
	private static int staticData = 30;

	// 静态内部类（Static Inner Class）
	public static class StaticInnerClass {
		public void display() {
			// 访问外部类的静态成员
			System.out.println("Static data: " + staticData);
		}
	}

	/*
	 * 静态内部类是使用static关键字修饰的内部类。
	 * 静态内部类不能访问外部类的实例成员，但可以访问外部类的静态成员。
	 * 静态内部类的实例与外部类的实例无关。
	 * */
	public static void main(String[] args) {
		// 创建静态内部类对象
		StaticInnerClass staticInner = new StaticInnerClass();
		staticInner.display();
	}
}

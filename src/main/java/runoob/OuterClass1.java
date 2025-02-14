package runoob;

public class OuterClass1 {
	private int outerData = 10;

	// 成员内部类（Member Inner Class）
	public class InnerClass {
		public void display() {
			// 访问外部类的成员
			System.out.println("OuterClass data: " + outerData);
		}
	}

	public void showInner() {
		// 创建内部类对象
		InnerClass inner = new InnerClass();
		inner.display();
	}

	/*
	 * 成员内部类是定义在另一个类的内部的类，它作为外部类的一个成员存在。
	 * 成员内部类可以访问外部类的所有成员，包括私有成员。
	 * */
	public static void main(String[] args) {
		OuterClass1 outer = new OuterClass1();
		outer.showInner();
	}
}
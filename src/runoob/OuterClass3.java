package runoob;

public class OuterClass3 {
	public void showInner() {
		// 匿名内部类（Anonymous Inner Class）
		// 匿名内部类实现接口
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Running...");
			}
		};

		// 启动线程
		Thread thread = new Thread(runnable);
		thread.start();
	}

	/*
	 * 匿名内部类是没有名字的内部类，通常用于实现接口或继承类时，不需要单独定义一个类。
	 * 匿名内部类可以简化代码，尤其是在需要快速实现接口或类时。
	 * */
	public static void main(String[] args) {
		OuterClass3 outer = new OuterClass3();
		outer.showInner();
	}
}

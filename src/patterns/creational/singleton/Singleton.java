package patterns.creational.singleton;

public class Singleton {
	// 私有
	private static Singleton instance;
	
	// 构造方法私有
	private Singleton() {}
	
	// 公有
	public static Singleton getInstance() {
//		if (instance == null) {
//			instance = new Singleton();
//		}
		if (instance == null) { //双重检查锁定
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello, this is Singleton!");
	}

}

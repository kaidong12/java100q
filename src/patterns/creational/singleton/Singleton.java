package patterns.creational.singleton;

public class Singleton {
	private static Singleton instance;
	private Singleton() {}
	
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

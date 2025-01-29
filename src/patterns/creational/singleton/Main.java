package patterns.creational.singleton;

// 2025-01-29
public class Main {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.showMessage();		
	}
}

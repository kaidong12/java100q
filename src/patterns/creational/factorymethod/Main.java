package patterns.creational.factorymethod;

// 2025-01-29
public class Main {
	public static void main(String[] args) {
		HiringManager devManager = new DevelopmentManager();
		devManager.takeInterview();
		
		HiringManager saleManager = new SalesManager();
		saleManager.takeInterview();
	}

}

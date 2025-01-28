package patterns.creational.factorymethod;

public class Main {
	public static void main(String[] args) {
		HiringManager devManager = new DevelopmentManager();
		devManager.takeInterview();
		
		HiringManager saleManager = new SalesManager();
		saleManager.takeInterview();
	}

}

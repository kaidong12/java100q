package patterns.creational.abstractfactory;

// 2025-01-29
// 客户端
public class Main {
	public static void main(String[] args) {
		WoodenDoorFactory woodFactory = new WoodenDoorFactory();
		woodFactory.makeDoor().getDescription();
		woodFactory.makeFittingExpert().getDescription();
			
		IronDoorFactory ironFactory = new IronDoorFactory();
		ironFactory.makeDoor().getDescription();
		ironFactory.makeFittingExpert().getDescription();
	}
}

package patterns.creational.abstractfactory1;

//2025-01-29
//2025-02-10
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

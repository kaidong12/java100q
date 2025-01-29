package patterns.creational.abstractfactory;

// 具体工厂
public class WoodenDoorFactory implements DoorFactory{
	
	@Override
	public Door makeDoor() {
		return new WoodenDoor();
	}
	
	@Override
	public FittingExpert makeFittingExpert() {
		return new Carpenter();
	}
}

package patterns.creational.abstractfactory1;

// 具体工厂
public class IronDoorFactory implements DoorFactory{

	@Override
	public IronDoor makeDoor() {
		return new IronDoor();
	}
	
	@Override
	public Welder makeFittingExpert() {
		return new Welder();
	}
}

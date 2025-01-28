package patterns.creational.simplefactory;

public class DoorFactory {
	public static Door makeDoor(float w, float h) {
		return new WoodenDoor(w, h);
	}
}

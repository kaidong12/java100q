package patterns.creational.simplefactory;

//2025-01-29
public class Main {
	public static void main(String[] args) {
//		Door door = new WoodenDoor(1,2);
		Door door = DoorFactory.makeDoor(100, 200);

		System.out.println("Height: " + door.getHeight() + "\nWidth: " + door.getWidth());
		Door door2 = DoorFactory.makeDoor(120, 200);
		System.out.println("Height: " + door2.getHeight() + "\nWidth: " + door2.getWidth());
	}
}

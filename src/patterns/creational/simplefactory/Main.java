package patterns.creational.simplefactory;

public class Main {
	public static void main(String[] args) {
		Door door = DoorFactory.makeDoor(100, 200);
		System.out.println("Height: "+door.getHeight() + "\nWidth: " + door.getWidth());
		Door door2 = DoorFactory.makeDoor(120, 200);
		System.out.println("Height: "+door2.getHeight() + "\nWidth: " + door2.getWidth());
	}
}

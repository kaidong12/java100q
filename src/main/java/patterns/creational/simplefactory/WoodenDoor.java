package patterns.creational.simplefactory;

public class WoodenDoor implements Door{
	private float width;
	private float height;
	
	public WoodenDoor(float w, float h) {
		this.width = w;
		this.height = h;
	}
	
	@Override
	public float getWidth() {
		return this.width;
	}
	
	@Override
	public float getHeight() {
		return this.height;
	}

}

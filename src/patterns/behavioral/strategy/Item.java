package patterns.behavioral.strategy;

public class Item {
	private String name;
	private float price;
	
	public Item(String name, float price) {
		this.name = name;
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}

}

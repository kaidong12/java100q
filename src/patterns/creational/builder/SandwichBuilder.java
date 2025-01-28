package patterns.creational.builder;

public class SandwichBuilder {

	private int size = 10;
	private boolean cheese = false;
	private boolean peperoni = false;
	private boolean lettuce = false;
	private boolean tomato = false;

	public SandwichBuilder setSize(int size) {
		this.size = size;
		return this;
	}

	public SandwichBuilder addPepperoni() {
		this.peperoni =  true;
		return this;
	}
	
	public SandwichBuilder addCheese() {
		this.cheese = true;
		return this;
	}
	
	public SandwichBuilder addLettuce() {
		this.lettuce = true;
		return this;
	}

	public SandwichBuilder addTomato() {
		this.tomato = true;
		return this;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public boolean getCheese() {
		return this.cheese;
	}
	
	public boolean getPeperoni() {
		return this.peperoni;
	}
	
	public boolean getLettuce() {
		return this.lettuce;
	}
	
	public boolean getTomato() {
		return this.tomato;
	}
	
	public Sandwich build() {
		return new Sandwich(this);
	}
}

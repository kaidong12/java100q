package patterns.creational.builder;

public class Sandwich {
	private int size;
	private boolean cheese;
	private boolean pepperoni;
	private boolean lettuce;
	private boolean tomato;
	
	public Sandwich(SandwichBuilder builder) {
		this.size = builder.getSize();
		this.cheese = builder.getCheese();
		this.pepperoni = builder.getPeperoni();
		this.lettuce = builder.getLettuce();
		this.tomato = builder.getTomato();
	}
	
	public String getDescription() {
		return "Sandwich info: \nSize: " + size + (cheese ? ", has Cheese" : "")
				+ (pepperoni ? ", has Peperoni" : "" ) 
				+ (lettuce ? ", has Lettuce" : "")
				+ (tomato ? ", has Tomato" : "") + ".";
	}

}

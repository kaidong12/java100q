package patterns.creational.builder;

public class Sandwich {
	private int size;
	private boolean cheese;
	private boolean pepperoni;
	private boolean lettuce;
	private boolean tomato;
	
	// 没有无参构造函数
	
	// 只能通过SandwichBuilder传入参数
	// 若参数数量发生变化，只需修改SandwichBuilder，而无需修改客户端代码
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

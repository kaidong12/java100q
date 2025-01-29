package patterns.creational.builder;

// 2025-01-29
public class Main {
	public static void main(String[] args) {
		Sandwich sandwich = new SandwichBuilder()
				.setSize(25)
				.addCheese()
				.addLettuce()
				.addPepperoni()
				.addTomato()
				.build();
		System.out.print(sandwich.getDescription());
	}
}

package patterns.creational.builder;

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

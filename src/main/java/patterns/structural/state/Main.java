package patterns.structural.state;

public class Main {

	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		System.out.println("========插入硬币========");
		coffeeMachine.insertCoin();
		coffeeMachine.insertCoin();
		coffeeMachine.dispenseCoffee();
		
		System.out.println("========选择咖啡========");	
		coffeeMachine.selectCoffee();
		coffeeMachine.insertCoin();
		coffeeMachine.selectCoffee();

		System.out.println("========制作完成========");
		coffeeMachine.dispenseCoffee();
		coffeeMachine.selectCoffee();
		coffeeMachine.dispenseCoffee();
	}

}

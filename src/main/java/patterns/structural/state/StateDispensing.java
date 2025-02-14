package patterns.structural.state;

public class StateDispensing implements CoffeeMachineState {
	private CoffeeMachine coffeeMachine;

	public StateDispensing(CoffeeMachine coffeeMachine){
		this.coffeeMachine = coffeeMachine;
	}

	@Override
	public void insertCoin() {
		System.out.println("正在制作咖啡,不要重复该操作。");
	}

	@Override
	public void selectCoffee() {
		System.out.println("正在制作咖啡,不要重复该操作。");
	}

	@Override
	public void dispenseCoffee() {
		System.out.println("咖啡已制作完成,请取走。");
		coffeeMachine.setState(coffeeMachine.getIdleState());
	}

}

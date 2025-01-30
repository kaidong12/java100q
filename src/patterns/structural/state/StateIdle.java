package patterns.structural.state;

public class StateIdle implements CoffeeMachineState {
	private CoffeeMachine coffeeMachine;

	public StateIdle(CoffeeMachine coffeeMachine){
		this.coffeeMachine = coffeeMachine;
	}

	@Override
	public void insertCoin() {
		System.out.println("硬币已插入，请选择咖啡。");
		coffeeMachine.setState(coffeeMachine.getSelectingState());
	}

	@Override
	public void selectCoffee() {
		System.out.println("请先插入硬币。");
	}

	@Override
	public void dispenseCoffee() {
		System.out.println("请先插入硬币，并选择咖啡。");
	}

}

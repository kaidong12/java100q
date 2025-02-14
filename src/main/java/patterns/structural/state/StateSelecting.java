package patterns.structural.state;

public class StateSelecting implements CoffeeMachineState {
	private CoffeeMachine coffeeMachine;

	public StateSelecting(CoffeeMachine coffeeMachine){
		this.coffeeMachine = coffeeMachine;
	}

	@Override
	public void insertCoin() {
		System.out.println("硬币已插入，请不要重复插入硬币。请选择咖啡。");
	}

	@Override
	public void selectCoffee() {
		System.out.println("咖啡正在制作中...");
		coffeeMachine.setState(coffeeMachine.getDispensingState());
	}

	@Override
	public void dispenseCoffee() {
		System.out.println("请先选择咖啡。");
	}

}

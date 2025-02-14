package patterns.structural.state;

public class CoffeeMachine {
	private CoffeeMachineState idleState;
	private CoffeeMachineState selectingState;
	private CoffeeMachineState dispensingState;

	private CoffeeMachineState currentState;

	public CoffeeMachine() {
		idleState = new StateIdle(this);
		selectingState = new StateSelecting(this);
		dispensingState = new StateDispensing(this);

		currentState = idleState;
	}

	public void setState(CoffeeMachineState state) {
		this.currentState = state;
	}

	public void insertCoin() {
		currentState.insertCoin();
	}

	public void selectCoffee() {
		currentState.selectCoffee();
	}

	public void dispenseCoffee() {
		currentState.dispenseCoffee();
	}

	public CoffeeMachineState getSelectingState() {
		return selectingState;
	}

	public CoffeeMachineState getDispensingState() {
		return dispensingState;
	}

	public CoffeeMachineState getIdleState() {
		return idleState;
	}

}

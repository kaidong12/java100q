package patterns.behavioral.strategy;

//具体策略类（Concrete Strategies）：实现策略接口，定义具体的算法
public class StrategyCredit implements PaymentStrategy {
	private String creditCard;

	public StrategyCredit(String cardNumber) {
		this.creditCard = cardNumber;
	}

	@Override
	public void pay(float amount) {
		System.out.println("Paid " + amount + " using Credit Card.");

	}

}

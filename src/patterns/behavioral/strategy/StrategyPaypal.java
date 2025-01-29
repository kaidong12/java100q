package patterns.behavioral.strategy;

//具体策略类（Concrete Strategies）：实现策略接口，定义具体的算法
public class StrategyPaypal implements PaymentStrategy {
	private String email;

	public StrategyPaypal(String email) {
		this.email = email;
	}

	@Override
	public void pay(float amount) {
		System.out.println("Paid " + amount + " using Paypal.");

	}

}

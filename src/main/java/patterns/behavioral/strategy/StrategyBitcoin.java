package patterns.behavioral.strategy;

//具体策略类（Concrete Strategies）：实现策略接口，定义具体的算法
public class StrategyBitcoin implements PaymentStrategy {
	private String walletAddress;

	public StrategyBitcoin(String walletAddress) {
		this.walletAddress = walletAddress;
	}

	@Override
	public void pay(float amount) {
		System.out.println("Paid " + amount + " using Bitcoin.");

	}

}

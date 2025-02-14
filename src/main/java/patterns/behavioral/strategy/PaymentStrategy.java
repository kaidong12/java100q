package patterns.behavioral.strategy;

//策略接口（Strategy Interface）：定义所有支持的算法的公共接口
public interface PaymentStrategy {
	void pay(float amount);
}

package patterns.structural.decorator;

// 抽象装饰器（Decorator）
public abstract class DecoratorAbstract implements Coffee{
	protected Coffee decoratedCoffee;
	
	public DecoratorAbstract(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}
	
	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}
		
	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}
}

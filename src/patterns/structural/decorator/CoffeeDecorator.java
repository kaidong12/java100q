package patterns.structural.decorator;

// 抽象装饰器（Decorator）
public abstract class CoffeeDecorator implements Coffee{
	protected Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee coffee) {
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

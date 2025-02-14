package patterns.structural.decorator;

// 具体装饰器（Concrete Decorator）
public class DecoratorMilk extends DecoratorAbstract{
	public DecoratorMilk(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 2.0;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Milk";
	}
}

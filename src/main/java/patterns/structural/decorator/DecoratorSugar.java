package patterns.structural.decorator;

// 具体装饰器（Concrete Decorator）
public class DecoratorSugar extends DecoratorAbstract{

	public DecoratorSugar(Coffee coffee){
		super(coffee);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 1.0;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Sugar";
	}
}

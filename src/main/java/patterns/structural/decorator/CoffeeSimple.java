package patterns.structural.decorator;

// 具体组件（Concrete Component）
public class CoffeeSimple implements Coffee{
	
	@Override
	public double getCost() {
		return 5.0;
	}
	
	@Override
	public String getDescription() {
		return "Simple Coffee";
	}

}

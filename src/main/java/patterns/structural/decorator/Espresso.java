package patterns.structural.decorator;

// 具体组件（Concrete Component）
public class Espresso implements Coffee{
	
	@Override
	public double getCost() {
		return 10.0;
	}
	
	@Override
	public String getDescription() {
		return "Espresso";
	}
}

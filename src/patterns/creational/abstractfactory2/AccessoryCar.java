package patterns.creational.abstractfactory2;

//具体产品：汽车配件
public class AccessoryCar extends Accessory {
	@Override
	public void use() {
		System.out.println("Using a car accessory.");
	}
}

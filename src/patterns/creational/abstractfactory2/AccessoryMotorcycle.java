package patterns.creational.abstractfactory2;

//具体产品：摩托车配件
public class AccessoryMotorcycle extends Accessory {
	@Override
	public void use() {
		System.out.println("Using a motorcycle accessory.");
	}
}

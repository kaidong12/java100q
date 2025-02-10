package patterns.creational.abstractfactory2;

//具体产品：自行车配件
public class AccessoryBicycle extends Accessory {
	@Override
	public void use() {
		System.out.println("Using a bicycle accessory.");
	}
}

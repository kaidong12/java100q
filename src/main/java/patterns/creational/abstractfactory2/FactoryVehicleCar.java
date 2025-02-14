package patterns.creational.abstractfactory2;

//具体工厂：汽车工厂
public class FactoryVehicleCar extends FactoryVehicle {
	@Override
	public Vehicle createVehicle() {
		return new VehicleCar();
	}

	@Override
	public Accessory createAccessory() {
		return new AccessoryCar();
	}
}

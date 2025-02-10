package patterns.creational.abstractfactory2;

//具体工厂：自行车工厂
public class FactoryVehicleBicycle extends FactoryVehicle {
	@Override
	public Vehicle createVehicle() {
		return new VehicleBicycle();
	}

	@Override
	public Accessory createAccessory() {
		return new AccessoryBicycle();
	}
}

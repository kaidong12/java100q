package patterns.creational.abstractfactory2;

//具体工厂：摩托车工厂
public class FactoryVehicleMotorcycle extends FactoryVehicle {
	@Override
	public Vehicle createVehicle() {
		return new VehicleMotorcycle();
	}

	@Override
	public Accessory createAccessory() {
		return new AccessoryMotorcycle();
	}
}

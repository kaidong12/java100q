package patterns.creational.factorymethod;

public class VehicleBicycleFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new VehicleBicycle();
	}
}

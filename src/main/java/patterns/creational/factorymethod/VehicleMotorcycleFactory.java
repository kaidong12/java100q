package patterns.creational.factorymethod;

public class VehicleMotorcycleFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new VehicleMotorcycle();
	}
}

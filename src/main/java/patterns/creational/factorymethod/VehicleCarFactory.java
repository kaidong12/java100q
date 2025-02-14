package patterns.creational.factorymethod;

public class VehicleCarFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new VehicleCar();
	}
}

package patterns.creational.abstractfactory2;

public class Main {

	/*
	 * 抽象工厂模式（Abstract Factory Pattern）是一种创建型设计模式，
	 * 它提供了一个接口（抽象工厂），用于创建一系列相关或依赖的对象，而无需明确指定它们的具体类。
	 * 
	 * 抽象工厂模式的核心在于创建一个工厂的工厂 -- FactoryVehicle
	 * 通过抽象工厂类来定义创建对象的接口，而具体的对象创建则由具体的工厂类实现。
	 */

	public static void main(String[] args) {
		// 使用汽车工厂创建汽车和汽车配件
		FactoryVehicle carFactory = new FactoryVehicleCar();
		Vehicle car = carFactory.createVehicle();
		Accessory carAccessory = carFactory.createAccessory();
		car.drive();
		carAccessory.use();

		System.out.println("---------------------");

		// 使用摩托车工厂创建摩托车和摩托车配件
		FactoryVehicle motorcycleFactory = new FactoryVehicleMotorcycle();
		Vehicle motorcycle = motorcycleFactory.createVehicle();
		Accessory motorcycleAccessory = motorcycleFactory.createAccessory();
		motorcycle.drive();
		motorcycleAccessory.use();

		System.out.println("---------------------");

		// 使用自行车工厂创建自行车和自行车配件
		FactoryVehicle bicycleFactory = new FactoryVehicleBicycle();
		Vehicle bicycle = bicycleFactory.createVehicle();
		Accessory bicycleAccessory = bicycleFactory.createAccessory();
		bicycle.drive();
		bicycleAccessory.use();

	}
}
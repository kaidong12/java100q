package patterns.creational.factorymethod;

//2025-01-29
//2025-02-10
public class Main {
	public static void main(String[] args) {
		HiringManager devManager = new DevelopmentManager();
		devManager.takeInterview();

		HiringManager saleManager = new SalesManager();
		saleManager.takeInterview();

		/*
		 * 工厂方法模式（Factory Method Pattern）是一种创建型设计模式，
		 * 它定义了一个创建对象的接口（或抽象方法），但将具体的创建逻辑推迟到子类中实现。
		 * 
		 * 工厂方法模式的核心在于“工厂类”和“产品类”的分离，通过工厂类的多态性来实现对象的创建。
		 */
		// 使用CarFactory创建Car
		VehicleFactory carFactory = new VehicleCarFactory();
		Vehicle car = carFactory.createVehicle();
		car.drive();

		// 使用MotorcycleFactory创建Motorcycle
		VehicleFactory motorcycleFactory = new VehicleMotorcycleFactory();
		Vehicle motorcycle = motorcycleFactory.createVehicle();
		motorcycle.drive();

		// 使用BicycleFactory创建Bicycle
		VehicleFactory bicycleFactory = new VehicleBicycleFactory();
		Vehicle bicycle = bicycleFactory.createVehicle();
		bicycle.drive();

	}

}

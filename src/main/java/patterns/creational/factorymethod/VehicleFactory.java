package patterns.creational.factorymethod;

public abstract class VehicleFactory {
	/*
	 * 定义了一个工厂方法（createProduct），用于创建产品对象。
	 * 它是一个抽象类或接口，具体的产品创建逻辑由子类实现。
	 * */
	public abstract Vehicle createVehicle();
}

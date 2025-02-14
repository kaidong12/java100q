package patterns.creational.abstractfactory2;

public abstract class FactoryVehicle {
	/*
	 * 抽象工厂类（Abstract Factory）：
	 * 定义了创建一系列产品的接口，但不实现具体的创建逻辑。
	 * 它通常是一个抽象类或接口。
	 * */
    public abstract Vehicle createVehicle();
    public abstract Accessory createAccessory();
}

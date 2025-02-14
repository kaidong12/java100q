package patterns.dependency.injection1;

public class Car {
	private Engine engine;

	// 构造器注入
	// 依赖关系： 一个类（Car）依赖于另一个类（Engine）来完成某些功能。
	public Car(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		engine.start();
		System.out.println("Car is driving.");
	}
}

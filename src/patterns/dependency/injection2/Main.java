package patterns.dependency.injection2;

/*
 * 假设我们有一个Car类，它依赖于Engine类。
 * 我们通过Setter注入的方式将Engine注入到Car中。
 * 
 * */
public class Main {
	public static void main(String[] args) {
		// 创建依赖对象
		Engine engine = new Engine();

		// 创建客户端对象
		Car car = new Car();

		// 将依赖注入到客户端
		car.setEngine(engine);

		// 使用客户端
		car.drive();
	}
}

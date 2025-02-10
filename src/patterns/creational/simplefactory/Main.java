package patterns.creational.simplefactory;

//2025-01-29
//2025-02-10
public class Main {
	/*
	 * 缺点: 
	 * 1, 工厂类职责过重： 工厂类需要知道所有产品类的细节，如果产品类过多，工厂类的逻辑会变得复杂。 
	 * 2, 违反开闭原则： 当需要添加新的产品类时，可能需要修改工厂类的代码，这违反了开闭原则。 
	 * 
	 */
	public static void main(String[] args) {
//		Door door = new WoodenDoor(1,2);
		Door door = DoorFactory.makeDoor(100, 200);

		System.out.println("Height: " + door.getHeight() + "\nWidth: " + door.getWidth());
		Door door2 = DoorFactory.makeDoor(120, 200);
		System.out.println("Height: " + door2.getHeight() + "\nWidth: " + door2.getWidth());

		/*
		 * 简单工厂模式（Simple Factory Pattern）是一种创建型设计模式，
		 * 它通过一个工厂类来封装创建对象的逻辑，从而让客户端代码无需直接使用“new”运算符来创建对象。
		 * 
		 * 简单工厂模式的核心是通过一个工厂类来决定创建哪种类型的对象， 客户端代码只需要向工厂类传递一个参数，工厂类根据参数返回对应的对象实例。
		 */
		// 获取加法计算器并计算
		Calculator_Interface addCalculator = CalculatorFactory.getCalculator("add");
		System.out.println("10 + 5 = " + addCalculator.calculate(10, 5));

		// 获取减法计算器并计算
		Calculator_Interface subtractCalculator = CalculatorFactory.getCalculator("subtract");
		System.out.println("10 - 5 = " + subtractCalculator.calculate(10, 5));

		// 获取乘法计算器并计算
		Calculator_Interface multiplyCalculator = CalculatorFactory.getCalculator("multiply");
		System.out.println("10 * 5 = " + multiplyCalculator.calculate(10, 5));

		// 获取除法计算器并计算
		Calculator_Interface divideCalculator = CalculatorFactory.getCalculator("divide");
		System.out.println("10 / 5 = " + divideCalculator.calculate(10, 5));

	}

}

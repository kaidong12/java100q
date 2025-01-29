package patterns.structural.decorator;

/*
	装饰器模式的实现步骤:
	1, 定义一个抽象组件接口，声明所有子类必须实现的方法。
	2, 创建具体组件类，实现抽象组件接口。
	3, 定义一个抽象装饰器类，实现抽象组件接口，并包含一个对抽象组件的引用。
	4, 创建具体装饰器类，继承抽象装饰器类，并实现具体的装饰功能。
	5, 客户端通过装饰器动态地为对象添加功能。
 */

// 客户端
public class Main {
	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription() + " $" + coffee.getCost());
		
		coffee = new DecoratorSugar(coffee);
		System.out.println(coffee.getDescription() + " $" + coffee.getCost());	
		
		coffee = new DecoratorMilk(coffee);
		System.out.println(coffee.getDescription() + " $" + coffee.getCost());
		
		coffee = new Espresso();
		System.out.println(coffee.getDescription() + " $" + coffee.getCost());
		
		coffee = new DecoratorSugar(coffee);
		System.out.println(coffee.getDescription() + " $" + coffee.getCost());	
		
		coffee = new DecoratorMilk(coffee);
		System.out.println(coffee.getDescription() + " $" + coffee.getCost());
	}
}

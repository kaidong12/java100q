package runoob;

class A05_OOP_Demo {

	public void test(Animal aa) {
		aa.sleep();
	}

	public static void main(String[] args) {

		System.out.println("面向对象编程（OOP）的三大核心特性：");
		System.out.println("封装（Encapsulation）：将数据（属性）和操作数据的方法（行为）绑定在一起，隐藏对象的内部实现细节，只暴露必要的接口与外部交互。");
		System.out.println("继承（Inheritance）：通过继承，子类可以复用父类的属性和方法，并可以对其进行扩展和修改。");
		System.out.println("多态（Polymorphism）：同一操作作用于不同对象时，可以表现出不同的行为。");

		A05_OOP_Demo test = new A05_OOP_Demo();

		Animal a = new Animal("动物");
		test.test(a);

		Horse b = new Horse();
		test.test(b);

		Cat c = new Cat();
		test.test(c);

	}
}

class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public void sleep() {
		System.out.println(this.name + ": 躺着睡");
	}

}

class Horse extends Animal {

	public Horse() {
		super("马");
	}

	public void sleep() {
		System.out.println(this.name + ": 站着睡");
	}
}

class Cat extends Animal {
	public Cat() {
		super("猫");
	}

	void catch_rat() {
		System.out.println(this.name + ": 抓老鼠");
	}

	public void sleep() {
		System.out.println(this.name + ": 趴着睡");
	}
}
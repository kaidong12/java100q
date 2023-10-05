package runoob;

class A05_Inheritance {

	public void test(Animal aa) {
		aa.sleep();
	}

	public static void main(String[] args) {

		A05_Inheritance test = new A05_Inheritance();

		Animal a = new Animal();
		test.test(a);

		Horse b = new Horse();
		test.test(b);

		Cat c = new Cat();
		test.test(c);

		System.out.print(2 << 3);

	}
}

class Animal {

	public void sleep() {
		System.out.println("躺着睡");
	}

}

class Horse extends Animal {

	public void sleep() {
		System.out.println("站着睡");
	}
}

class Cat extends Animal {
	void catch_rat() {
		System.out.println("抓老鼠");
	}

	public void sleep() {
		System.out.println("四脚朝天睡");
	}
}
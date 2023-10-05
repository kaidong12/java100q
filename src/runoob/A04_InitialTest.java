package runoob;

public class A04_InitialTest {
	/*
	 * 1）静态变量只会初始化（执行）一次。
	 * 
	 * 2）当有父类时，完整的初始化顺序为： 父类静态变量（静态代码块）->子类静态变量（静态代码块） ->父类非静态变量（非静态代码块）->父类构造器
	 * ->子类非静态变量（非静态代码块）->子类构造器 。
	 * 
	 */
	public static void main(String[] args) {
		A ab = new B();
		ab = new B();
		// output: ABabab

		A abc = new B("abc");
		abc = new B("abc");
	}
}

class A {
	public A(String a) {
		System.out.println("this is A: ");
		System.out.println("Parent Constructor with value: " + a);
	}

	static { // 父类静态代码块
		System.out.println("A");
	}

	public A() { // 父类构造器
		System.out.println("a");
	}
}

class B extends A {

	public B(String b) {
		super(b); // calling parent class constructor with argument y
		System.out.println("this is B: ");
		System.out.println("Child Constructor with value: " + b);
	}

	static { // 子类静态代码块
		System.out.println("B");
	}

	public B() { // 子类构造器
		System.out.println("b");
	}
}
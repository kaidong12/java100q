package runoob;

public class A02_Variables {
	/**
	 * 成员变量存在于堆内存中。静态变量存在于方法区中。
	 * 
	 * 成员变量与对象共存亡，随着对象创建而存在，随着对象被回收而释放。
	 * 静态变量与类共存亡，随着类的加载而存在，随着类的消失而消失。
	 */

	/**
	 * 静态变量：又称类变量，static修饰
	 * 作用域为整个类，可以被类中的任何方法、构造方法和语句块访问，静态变量的值在程序运行期间只有一个副本。
	 * 静态变量可以被访问修饰符修饰。
	 */
	private static int staticVar;

	/**
	 * 实例变量：又称成员变量，没有static修饰
	 * 作用域为整个类，可以被类中的任何方法、构造方法和语句块访问。
	 * 成员变量可以被访问修饰符修饰。
	 */
	private int instanceVar;

	public void method(int paramVar) {
		/**
		 * 局部变量
		 * 作用域只限于当前方法、构造方法或语句块中。
		 * 局部变量必须在使用前声明，并且不能被访问修饰符修饰。
		 */
		
		// 声明变量
		int localVar = 10;

		// 使用变量
		instanceVar = localVar;
		staticVar = paramVar;

		System.out.println("成员变量: " + instanceVar);
		System.out.println("静态变量: " + staticVar);
		System.out.println("参数变量: " + paramVar);
		System.out.println("局部变量: " + localVar);
	}

	public static void main(String[] args) {
		A02_Variables v = new A02_Variables();
		v.method(20);

	}

}
package runoob;

public class LambdaExample6 {

	public void myMethod1() {
		System.out.println("This is the outer method.");

		// 定义局部类
		class InnerClass {
			void innerMethod() {
				System.out.println("This is the inner method.");
			}
		}

		// 创建局部类的实例并调用方法
		InnerClass inner = new InnerClass();
		inner.innerMethod();
	}

	public void myMethod2() {
		System.out.println("This is the outer method.");

		// 使用Lambda表达式
		Runnable innerMethod = () -> System.out.println("This is the inner method.");

		// 调用Lambda表达式
		innerMethod.run();
	}

	public void myMethod3() {
		System.out.println("This is the outer method.");

		// 使用匿名内部类
		Runnable innerMethod = new Runnable() {
			@Override
			public void run() {
				System.out.println("This is the inner method.");
			}
		};

		// 调用匿名内部类的方法
		innerMethod.run();
	}

//	public void myMethod4() {
//        System.out.println("This is the outer method.");
//
//        // 定义一个方法
//        void innerMethod() {
//            System.out.println("This is the inner method.");
//        }
//
//        // 使用方法引用
//        Runnable runnable = this::innerMethod;
//
//        // 调用方法引用
//        runnable.run();
//    }

	public static void main(String[] args) {
		LambdaExample6 obj = new LambdaExample6();
		obj.myMethod1();
		obj.myMethod2();
		obj.myMethod3();
//		obj.myMethod4();
	}
}

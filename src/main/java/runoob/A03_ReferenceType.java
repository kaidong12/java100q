package runoob;

public class A03_ReferenceType {
	// Java 中只有值传递，对于对象参数，值的内容是对象的引用。
	/**
	 * 值传递：在方法调用时，传递的是实际参数的值的副本。当参数变量被赋予新的值时，只会修改副本的值，不会影响原始值。
	 * Java 中的基本数据类型都采用值传递方式传递参数变量的值。
	 * 
	 * 引用传递：在方法调用时，传递的是实际参数的引用（即内存地址）。当参数变量被赋予新的值时，会修改原始值的内容。
	 * Java 中的对象类型采用引用传递方式传递参数变量的值。
	 * 
	 */
	
    public static void main(String[] args) {
        Writer a = new Writer(18);
        Writer b = new Writer(18);
        modify(a, b);

        System.out.println(a.getAge());
        System.out.println(b.getAge());
    }

    private static void modify(Writer a1, Writer b1) {
        a1.setAge(30);

        b1 = new Writer(18);
        b1.setAge(30);
    }
}



package runoob;

class A18_Pass_by_value
{
    public static void main ( String[] args )
    {
        System.out.println( "值传递：传递参数的副本，修改副本不影响原始值" );

        System.out.println( "=============1, 基本数据类型示例=============" );
        int x = 10;
        System.out.println("调用前: x = " + x); // 输出: 10
        
        modifyPrimitive(x);
        System.out.println("调用后: x = " + x); // 输出: 10（未改变）


        System.out.println( "=============2,对象引用示例（关键理解）=============" );
        System.out.println("注意：Java中没有指针，Java中引用（Reference）的概念，是指向对象的句柄。");
        System.out.println("所有对象引用也是值传递：传递的是引用的副本(Stack)，不是对象本身(Heap)，修改引用的内容会影响原始对象，但重新赋值引用不会影响原始引用。");
        Person person = new Person("张三");
        System.out.println("调用前: " + person.name); // 输出: 张三
        
        modifyObject(person);
        System.out.println("调用后: " + person.name); // 输出: 李四（改变了！）
        
        tryToReassign(person);
        System.out.println("重赋值后: " + person.name); // 输出: 李四（未改变！）


        System.out.println( "=============3,数组示例=============" );
        int[] numbers = {1, 2, 3};
        System.out.println("调用前: " + java.util.Arrays.toString(numbers));
        // 输出: [1, 2, 3]
        
        modifyArrayContent(numbers);
        System.out.println("修改内容后: " + java.util.Arrays.toString(numbers));
        // 输出: [10, 2, 3]（内容改变了）
        
        tryToReassignArray(numbers);
        System.out.println("重赋值后: " + java.util.Arrays.toString(numbers));
        // 输出: [10, 2, 3]（引用未改变）

        System.out.println( "=============4,字符串示例=============" );
        String str = "Hello";
        System.out.println("调用前: " + str); // 输出: Hello
        
        modifyString(str);
        System.out.println("调用后: " + str); // 输出: Hello（未改变）
        
        // String的不可变性演示
        String original = "原始";
        String modified = original;
        modified = "修改"; // 创建了新对象
        
        System.out.println("original: " + original); // 输出: 原始
        System.out.println("modified: " + modified); // 输出: 修改
    }

    public static void modifyPrimitive(int num) {
        num = 20; // 修改的是副本，不影响原始的x
        System.out.println("方法内: num = " + num); // 输出: 20
    }

    // 可以修改对象的内容
    public static void modifyObject(Person p) {
        p.name = "李四"; // 修改的是对象的内容
        System.out.println("方法内修改: " + p.name); // 输出: 李四
    }
    
    // 不能重新赋值引用
    public static void tryToReassign(Person p) {
        p = new Person("王五"); // 这不会影响原始的引用
        System.out.println("方法内重赋值: " + p.name); // 输出: 王五
    }

    public static void modifyArrayContent(int[] arr) {
        arr[0] = 10; // 可以修改数组内容
    }
    
    public static void tryToReassignArray(int[] arr) {
        arr = new int[]{100, 200, 300}; // 不会影响原始引用
        System.out.println("方法内新数组: " + java.util.Arrays.toString(arr));
        // 输出: [100, 200, 300]
    }

    public static void modifyString(String s) {
        s = "World"; // 创建了新String对象，不影响原始引用
        System.out.println("方法内: " + s); // 输出: World
    }
}

class Person {
    String name;
    
    Person(String name) {
        this.name = name;
    }
}




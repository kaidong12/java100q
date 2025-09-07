package runoob;

import java.util.ArrayList;
import java.util.List;

public class A11_ArrayListExample {
	public static void main(String[] args) {
		System.out.println("=============使用原始泛型类型 - 可以放任意类型============");
        // 使用原始类型 - 可以存放任意类型
        List rawList = new ArrayList();
        
        rawList.add("字符串");      // String
        rawList.add(123);           // Integer
        rawList.add(45.67);         // Double
        rawList.add(true);          // Boolean
        rawList.add(new Object());  // Object
        
        System.out.println("原始List内容: " + rawList);
        
        // 读取时需要强制类型转换
        String str = (String) rawList.get(0);
        Integer num = (Integer) rawList.get(1);
        Double dbl = (Double) rawList.get(2);
        
        System.out.println("字符串: " + str);
        System.out.println("数字: " + num);
        System.out.println("小数: " + dbl);

		System.out.println("=============使用具体泛型类型 - 只能放指定类型============");
		// Create an ArrayList of Strings
		ArrayList<String> myArrayList = new ArrayList<>();

		// Add elements to the ArrayList
		myArrayList.add("apple");
		myArrayList.add("banana");
		myArrayList.add("cherry");

		// Get the size of the ArrayList
		int size = myArrayList.size();
		System.out.println("Size of ArrayList: " + size);

		// Access an element by index
		String element = myArrayList.get(1);
		System.out.println("Element at index 1: " + element);

		// Check if an element exists in the ArrayList
		boolean contains = myArrayList.contains("banana");
		System.out.println("Does ArrayList contain 'banana'? " + contains);

		// Remove an element by index
		myArrayList.remove(2);
		System.out.println("After removing element at index 2: " + myArrayList);

		// Remove an element by value
		boolean removed = myArrayList.remove("banana");
		System.out.println("Was 'banana' removed from the ArrayList? " + removed);

		// Iterate over the ArrayList using a for-each loop
		for (String s : myArrayList) {
			System.out.println(s);
		}

		System.out.println("=========================");

		// Create another ArrayList of Strings
		ArrayList<String> myArrayList2 = new ArrayList<>();

		// Add elements to the ArrayList
		myArrayList.add("apple2");
		myArrayList.add("banana2");
		myArrayList.add("cherry2");

		myArrayList.addAll(1, myArrayList2);

		// Iterate over the ArrayList using a for-each loop
		for (String s : myArrayList) {
			System.out.println(s);
		}

		// Clear the ArrayList
		myArrayList.clear();
		System.out.println("After clearing the ArrayList: " + myArrayList);
	}
}

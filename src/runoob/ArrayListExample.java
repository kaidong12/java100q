package runoob;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
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

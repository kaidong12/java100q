package runoob;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		// Create a LinkedList of Strings
		LinkedList<String> myLinkedList = new LinkedList<>();

		// Add elements to the LinkedList
		myLinkedList.add("apple");
		myLinkedList.add("banana");
		myLinkedList.add("cherry");

		// Get the size of the LinkedList
		int size = myLinkedList.size();
		System.out.println("Size of LinkedList: " + size);

		// Access an element by index
		String element = myLinkedList.get(1);
		System.out.println("Element at index 1: " + element);

		// Check if an element exists in the LinkedList
		boolean contains = myLinkedList.contains("banana");
		System.out.println("Does LinkedList contain 'banana'? " + contains);

		// Remove an element by index
		myLinkedList.remove(2);
		System.out.println("After removing element at index 2: " + myLinkedList);

		// Remove an element by value
		boolean removed = myLinkedList.remove("banana");
		System.out.println("Was 'banana' removed from the LinkedList? " + removed);

		// Iterate over the LinkedList using a for-each loop
		for (String s : myLinkedList) {
			System.out.println(s);
		}
		
        System.out.println("=========================");

		// Create another ArrayList of Strings
		ArrayList<String> myLinkedList2 = new ArrayList<>();

		// Add elements to the ArrayList
		myLinkedList2.add("apple2");
		myLinkedList2.add("banana2");
		myLinkedList2.add("cherry2");

		myLinkedList.addAll(1, myLinkedList2);

		// Iterate over the ArrayList using a for-each loop
		for (String s : myLinkedList2) {
			System.out.println(s);
		}

		// Clear the LinkedList
		myLinkedList.clear();
		System.out.println("After clearing the LinkedList: " + myLinkedList);
	}
}

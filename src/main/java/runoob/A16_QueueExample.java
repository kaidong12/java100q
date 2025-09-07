package runoob;

import java.util.LinkedList;
import java.util.Queue;

public class A16_QueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		// Add elements to the queue
		queue.add("Alice");
		queue.add("Bob");
		queue.add("Charlie");

		// Display the contents of the queue
		System.out.println("Queue: " + queue);

		System.out.println("queue.offer: " + queue.offer("David"));
		System.out.println("queue.offer: " + queue.offer("Eve"));

		System.out.println("Queue: " + queue);

		// Retrieve and remove the head of the queue
		String head = queue.poll();
		System.out.println("Head of the queue(poll): " + head);

		// Retrieve but do not remove the head of the queue
		String peek = queue.peek();
		System.out.println("Peek of the queue(peek): " + peek);

		// Retrieve but do not remove the head of the queue
		String element = queue.element();
		System.out.println("Peek of the queue(element): " + element);

		// Check if the queue contains a specific element
		boolean contains = queue.contains("Charlie");
		System.out.println("Does the queue contain 'Charlie'? " + contains);

		// Get the size of the queue
		int size = queue.size();
		System.out.println("Size of the queue: " + size);

		// Remove all elements from the queue
		queue.clear();
		System.out.println("Queue after clearing: " + queue);
	}
}

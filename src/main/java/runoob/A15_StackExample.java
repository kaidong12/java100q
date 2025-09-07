package runoob;
import java.util.Stack;

public class A15_StackExample {
    public static void main(String[] args) {
        System.out.println("=============使用具体泛型类型 - 只能放指定类型============");
        Stack<String> stack = new Stack<>();
        
        // Pushing elements to the top of the stack
        stack.push("apple");
        stack.push("banana");
        stack.push("orange");
        
        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());
        
        // Peeking at the top element of the stack
        String topElement = stack.peek();
        System.out.println("The top element is: " + topElement);
        
        // Popping the top element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        
        // Searching for an element in the stack
        int index = stack.search("apple");
        System.out.println("Index of 'apple' in the stack: " + index);
        
        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
        
        // Printing all the elements in the stack
        System.out.println("Elements in the stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

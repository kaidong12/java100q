package runoob;
import java.util.HashSet;
import java.util.Iterator;

public class A14_HashSetExample {
    public static void main(String[] args) {
        System.out.println("=============使用具体泛型类型 - 只能放指定类型============");
        // Create a HashSet of Strings
        HashSet<String> myHashSet = new HashSet<>();

        // Add elements to the HashSet
        myHashSet.add("apple");
        myHashSet.add("banana");
        myHashSet.add("cherry");

        // Get the size of the HashSet
        int size = myHashSet.size();
        System.out.println("Size of HashSet: " + size);

        // Check if an element exists in the HashSet
        boolean contains = myHashSet.contains("banana");
        System.out.println("Does HashSet contain 'banana'? " + contains);

        // Remove an element from the HashSet
        boolean removed = myHashSet.remove("banana");
        System.out.println("Was 'banana' removed from the HashSet? " + removed);

        // Iterate over the HashSet using a for-each loop
        for (String s : myHashSet) {
            System.out.println(s);
        }
        
        System.out.println("=========================");
        
        HashSet<String> myHashSet2 = new HashSet<>();

        // Add elements to the HashSet
        myHashSet2.add("apple2");
        myHashSet2.add("banana2");
        myHashSet2.add("cherry2");
        
        myHashSet.addAll(myHashSet2);
        
        Iterator<String> iterator = myHashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        

        // Clear the HashSet
        myHashSet.clear();
        System.out.println("After clearing the HashSet: " + myHashSet);
        
        System.out.println("After clearing the HashSet, check if HashSet is empty: " + myHashSet.isEmpty());
    }
}

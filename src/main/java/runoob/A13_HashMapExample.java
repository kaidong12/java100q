package runoob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A13_HashMapExample {
	public static void main(String[] args) {
		System.out.println("=============使用具体泛型类型 - 只能放指定类型============");
		// create a new HashMap
		Map<String, Integer> map = new HashMap<>();

		// add some key-value pairs to the map
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("cherry", 3);

//        map.put(1, "apple");
//        map.put(2, "banana");
//        map.put(3, "cherry");

		// print the map
		System.out.println("Map: " + map);

		// print the map size
		System.out.println("Size of Map: " + map.size());

		// check if the map contains a key
		boolean containsKey = map.containsKey("banana");
		System.out.println("Map contains key 'banana': " + containsKey);

		// check if the map contains a value
		boolean containsValue = map.containsValue(1);
		System.out.println("Map contains value 1: " + containsValue);

		// get the value associated with a key
		Integer value = map.get("apple");
		System.out.println("Value of key 'apple': " + value);

		// iterate over the keys in the map
		Set<String> keys = map.keySet();
		System.out.println("keys: " + keys);
		for (String key : keys) {
			System.out.println("Key: " + key);
		}

		// iterate over the values in the map
		System.out.println("Values: " + map.values());
		for (Integer val : map.values()) {
			System.out.println("Value: " + val);
		}

		// iterate over the entries in the map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue());
		}
		
		// remove a key-value pair from the map
		Integer removedValue = map.remove("cherry");
		System.out.println("Removed value: " + removedValue);

		System.out.println("=========================");

		// create another HashMap
		Map<String, Integer> map2 = new HashMap<>();

		// add some key-value pairs to the second map
		map2.put("date", 4);
		map2.put("elderberry", 5);
		map2.put("fig", 6);

		// copy all the key-value pairs from the second map to the first map
		map.putAll(map2);

		// print the map size
		System.out.println("Size of Map: " + map.size());

		// print if the map is empty
		System.out.println("print if the map is empty: " + map.isEmpty());

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}

		// clear the map
		map.clear();
		System.out.println("Map after clearing: " + map);

		// print if the map is empty
		System.out.println("print if the map is empty: " + map.isEmpty());
	}
}

package practice.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap12 {
	
	/*
	 * LinkedHashMap is a subclass of HashMap and also 
	 * implements the Map interface. 
	 * It maintains a doubly-linked list running through all of its entries, 
	 * which ensures the order of the key-value pairs. 
	 * This order can either be the order in which keys were 
	 * inserted into the map (insertion order) or the order in which keys
	 * were last accessed, from least-recently accessed to most-recently
	 * (access order).
	 * 
	 */
	// key features:
	
	/*
	 * Ordered: Unlike HashMap, which is unordered, LinkedHashMap maintains the
	 * order of key-value pairs. By default, it's the order in which they were
	 * inserted into the map (insertion order). However, if you use the 
	 * constructor with the boolean argument set to true,
	 *  it will be in access order.
	 * 
	 * Key Uniqueness: Just like HashMap, each key in the LinkedHashMap must be
	 * unique.
	 * 
	 * Allows Null: LinkedHashMap allows one null key and multiple null values.
	 * 
	 */
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> names = new LinkedHashMap<>(); // linkHAshMap is in order
		names.put(123, "Bob");
		names.put(1234, "Trevor");
		names.put(153, "Alex");
		
		System.out.println(names.containsKey(154)); // will check if we have thid key
		
		
		names.replace(153, "Sakhi"); 
		// replace method will replace the value of 153 but if we doesnt have it it will put or add it
		
		names.put(158, "Anna");
		names.replace(159, "Alex");
		
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
	}

}

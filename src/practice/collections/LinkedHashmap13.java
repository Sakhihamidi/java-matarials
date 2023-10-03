package practice.collections;

import java.util.LinkedHashMap;
import java.util.*;
import java.util.Map;

public class LinkedHashmap13 {

	// Activity -> 15 mins

	// Create a map that is going to store the data in order.
	// It should store the name and last names.
	// add 10 names and last names
	// print the values of your map

	// Use the loop and try to get the keys of your map
	// use the loop and try to get the keys and values from your map.

	// Then try to create TreeMap as well.
	// Add the same data to the TreeMap
	// Print the elements stored in the TreeMap
	// See the difference!

	public static void main(String[] args) {

		int[] numnbers = { 1, 2, 3, 4 };
		int number = 1;

		LinkedHashMap<String, String> info = new LinkedHashMap<>();
		info.put("z", "h");
		info.put("b", "a");
		info.put("a", "m");
		info.put("u", "r");
		info.put("b", "a");
		info.put("l", "w");
		info.put("q", "a");
		info.put("b", "a");
		info.put("p", "o");
		info.put("a", "a");
		info.put("a", "K");

		System.out.println(info);

		for (String key : info.keySet()) { // we have to lopp in order to get the keys
			System.out.println(key);
		}
		for (String values : info.values()) { // we have to lopp in order to get the Values
			System.out.println(values);
		}

		for (Map.Entry<String, String> element : info.entrySet()) {
			System.out.println(element.getKey() + " " + element.getValue());
		}

	System.out.println("-------------------------------------------------");

		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("z", "h");
		treeMap.put("b", "a");
		treeMap.put("a", "m");
		treeMap.put("u", "r");
		treeMap.put("b", "a");
		treeMap.put("l", "w");
		treeMap.put("q", "a");
		treeMap.put("b", "a");
		treeMap.put("p", "o");
		treeMap.put("a", "a");
		treeMap.put("a", "K");
		System.out.println(info);
		System.out.println(treeMap);

		TreeSet<String> namesss = new TreeSet<>();
		namesss.add("z");
		namesss.add("a");
		namesss.add("j");
		namesss.add("e");
		namesss.add("b");
		System.out.println(namesss);
		LinkedHashSet<String> naemee = new LinkedHashSet<>();
	}

}

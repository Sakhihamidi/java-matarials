package tek.week_9.day_2;

import java.util.LinkedList;

public class AcitivtyThreeLinkedList {
	
	public static void main(String[] args) {
		
		String[] names = {"Bob", "Nancy", "Mike", "Trevor"};
		LinkedList<String> listNames = new LinkedList<>();
		
		// Write a java program that is going to take the values from the 
		// array and add them into a linkedList?
		// print the values from the LinkedList.
		
		// print the values from the array first.
		
		// then, instead of printing the values, try to add them to the
		// LinkedList!
		
		for (String name : names) {
			listNames.add(name);
		}
		
		System.out.println(listNames);
		
		// if you want to target the indexes and do it by indes number
		
		for (int index = 0; index < names.length; index++) {
			listNames.add(names[index]);
		}
		
		System.out.println(listNames);
		
		
	}

}

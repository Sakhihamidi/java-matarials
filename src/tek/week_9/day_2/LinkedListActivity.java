package tek.week_9.day_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListActivity {
	
		public static void main(String[] args) {
			
			// Create instance of the LinkedList
			LinkedList<Integer> numbers = new LinkedList<>();
			// add some values to the LinkedList

			numbers.add(10);
			numbers.add(30);
			numbers.add(40);
			
			// Remove some values from the LinkedList
			numbers.remove(1); // will remover index 1
			numbers.remove(); // will remove the firs Element /index 0
			
			// print the values from the LinkedList 
			System.out.println(numbers);
			
			ArrayList<Integer> arrNumbers = new ArrayList<>();
			arrNumbers.add(10);
			arrNumbers.add(30);
			arrNumbers.add(40);
			
			System.out.println(arrNumbers);
			
		}
	}	

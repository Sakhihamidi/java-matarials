package tek.week_9.day_3;
import java.util.HashMap;

public class WorkingWithMaps {
		
		// HashMap:
		/*
		 * HashMap is one of the most widely used implementations of 
		 * the Map interface in Java. It stores data in 
		 * key-value pairs, and it allows you to retrieve a value based on
		 * its associated key. HashMap works by using a hashing technique, 
		 * where the keys are processed by a hash function to produce an
		 * index in an array, where the corresponding value will be stored.
		 */
		// Key features of the HashMap
		/*
		 * Unordered: The elements (key-value pairs) in a HashMap are not ordered.
		 * Neither by their key nor by their value.
		 * 
		 * Key Uniqueness: Each key in the HashMap must be unique. 
		 * If you try to insert a key-value pair with a key that's already in the map, 
		 * the old value for that key will be replaced.
		 * 
		 * Allows Null: HashMap allows one null key and multiple null values.
		 */
		
		public static void main(String[] args) {
			HashMap<Integer, String> studentInfo = new HashMap<>();
			studentInfo.put(1, "Bob");
			studentInfo.put(2, "Trevor");
			studentInfo.put(3, "Bob");
			studentInfo.put(4, "Alex");
			
			System.out.println(studentInfo);
			
			System.out.println(studentInfo.containsKey(2));
			System.out.println(studentInfo.containsValue("Matt"));
			
			
			for (int number : studentInfo.keySet()) {
				System.out.println(number);
			}
		}
		
	}

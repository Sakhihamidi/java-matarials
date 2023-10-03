package tek.week_9.day_2;
import java.util.LinkedList;
public class ActivityLinkedListTwo {
	// Write a loop that is going to add values from 10 to 20
		// in a LinkedList. 
		
		// print the values after they've added to the LinkedList.
		
		public static void main(String[] args) {
			LinkedList<Integer> linkedList = new LinkedList<>();

			for (int number = 10; number <= 20; number++) {
				linkedList.add(number);
			}
			
			System.out.println(linkedList);
			
			// give me odd numbers from the linked list?
			
			for (int index = 0; index < linkedList.size(); index++) {
				if (linkedList.get(index) % 2 != 0) {
					System.out.println(linkedList.get(index));
				}
			}			
		}
	}
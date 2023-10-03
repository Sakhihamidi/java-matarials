package tek.week_9.day_4;

import java.util.ArrayDeque;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class ActivityQueues {

	/*
	 * add(e): Inserts the specified element into the queue. Throws an exception if
	 * the operation fails (e.g., if the queue is bounded and full).
	 */

	/*
	 * remove(): Retrieves and removes the head of the queue. Throws an exception if
	 * the queue is empty.
	 */

	/*
	 * poll(): Retrieves and removes the head of the queue, or returns null if the
	 * queue is empty.
	 */
	/*
	 * peek(): Retrieves but does not remove the head of the queue, or returns null
	 * if the queue is empty.
	 */
	/*
	 * offer(e): Inserts the specified element into the queue, returning true if the
	 * operation succeeds and false otherwise.
	 */
	public static void main(String[] args) {

		Queue<Character> names = new ArrayDeque<Character>(3);
		names.add('A');
		names.add('B');
		names.add('C');
		names.add('D');
		names.add('E');
		System.out.println(names);
		names.remove('D');
		System.out.println(names);
		names.poll();
		System.out.println(names);
		System.out.println(names.peek());
		System.out.println(names.offer('B'));
		System.out.println(names);
		System.out.println(names.offer('A'));
		System.out.println(names);

//		Queue<Integer> numbers = new LinkedBlockingDeque<Integer>(3);
//		numbers.offer(1);
//		numbers.offer(1);
//		System.out.println(numbers.offer(1));
//		numbers.offer(1);
//		System.out.println(numbers.offer(1));
//		System.out.println(numbers);
	}

}

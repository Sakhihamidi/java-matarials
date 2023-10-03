package practice.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queus16 {
	/*
	 * A queue is a linear data structure that follows the First In First Out
	 * (FIFO)principle. This means that the first element added to the queue will be
	 * the first element to be removed. Think of a queue as a real-life queue or
	 * line(like in a bank or grocery checkout) — the first person to get in line is
	 * the first person to be served.
	 */

	//

	/*
	 * In Java, the Queue interface represents this data structure and is a part of
	 * the Java Collections Framework. The Queue interface provides methods for
	 * performing standard queue operations:
	 */

	/*
	 * add(e): Inserts the specified element into the queue. Throws an exception if
	 * the operation fails (e.g., if the queue is bounded and full).
	 */

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
		names.poll(); // will remove the head means first value
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

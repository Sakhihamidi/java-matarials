package practice.collections;

import java.util.*;
import java.util.ArrayDeque;

public class Stack17 {

	/*
	 * A stack is a linear data structure that follows the Last In First Out
	 * (LIFO)principle.
	 * 
	 * This means that the last element added to the stack will be the first element
	 * to be removed. Think of a stack as a stack of plates: you can only add or
	 * remove a plate from the top of the stack, not from the middle or bottom.
	 */

	/* Push: Adds an element to the top of the stack. */

	// pop: Removes the top element from the stack.

	// Peek (or Top): Returns the top element of the stack without removing it.

	// isEmpty: Checks if the stack is empty.

	// isFull (for bounded/limited size stacks): Checks if the stack is full.

	public static void main(String[] args) {

		Stack<Integer> numbers = new Stack();

		// Adding some values to stack
		numbers.push(10);
		numbers.push(50);
		numbers.push(40);
		System.out.println(numbers);
//			// Removing a value from the stack
//			System.out.println("Popped element: " + numbers.pop()); will remove the last input value top value 
//			System.out.println("Removing element: "+ numbers.remove(3)); // will remove the value on number 3
//			System.out.println("Removing element: "+ numbers.remove(70));
//			System.out.println(numbers.remove);
		System.out.println(numbers.indexOf(40));
//			System.out.println(numbers.remove(2));

		System.err.println("Numbers: " + numbers);
		System.err.println(numbers.remove(10));

		System.out.println("Values after pop: " + numbers);
		// Getting the top element from my stack
		System.out.println("Peek value: " + numbers.peek());
		// Check if the stack is empty.
		System.out.println("Is my stack empty? " + numbers.isEmpty());
		// Check if the stack is full
//			System.out.println("Is my stack full? " + numbers.isFull());

		Queue<Integer> queueNumbers = new ArrayDeque();
		queueNumbers.add(10);
		queueNumbers.add(50);
		queueNumbers.add(70);
		queueNumbers.add(90);
		queueNumbers.add(30);
		queueNumbers.add(20);

		System.err.println(queueNumbers);

		// Poll a vallue from queue
		System.out.println("Removed: " + queueNumbers.poll());
		// peek value fro the queue
		System.out.println("Peek value after poll: " + queueNumbers.peek());

	}

}

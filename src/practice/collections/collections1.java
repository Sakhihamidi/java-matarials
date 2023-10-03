package practice.collections;

public class collections1 {
	/*
	 * Defination collections: A collection is essentially an object 
	 * that groups multiple elements into a single unit. 
	 * The Collections framework provides many data structures and 
	 * algorithms to store and manipulate groups of data in memory.
	 */	
	
	// Benefits of using the collection:
	
	/*
	 * 1. Performance: Implementations are high-performance data structures.
	 * 2. Flexibility: Since they're based on interfaces, you can use custom
	 *  implementations if needed. 
	 * 3. Reduces Effort: Don't have to reinvent the wheel;
	 * many data structures and algorithms are readily available. Quality: Being
	 * 4. part of the Java Standard Library means they've been tested and 
	 * refined over time.
	 */
	// Collections
	//1 list
			// 1- ArrayList
			// 2- LinkedList
			// 3- Vector
			// 4- Stack
		
	//2 queue
			//queue
	//3 set
			//Hashset
			//LinkedHashset
	
	// list- queue and set are interfaces 
	// ArrayList - LinkedList - Vector and Stack are Classes
	
	// Map 
	//HahsMap
	
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 10;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
	//	numbers[5] = 50; by using fixed sizre array we canot have index 5 and we will get an exception 
	// and this problem will solve with collections

		for (int n : numbers) {
			System.out.println(n);
	}

}
}

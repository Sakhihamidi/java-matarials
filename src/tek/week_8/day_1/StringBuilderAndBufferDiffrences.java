package tek.week_8.day_1;

public class StringBuilderAndBufferDiffrences {
	
//  StringBuffer: All the primary operations (like append, insert, delete, 
//	etc.) are synchronized, which means StringBuffer is thread-safe. 
//   Multiple threads can't access its methods
//		concurrently in a way that's unsafe.
	
//StringBuilder: It is not synchronized, meaning it's not inherently 
//	 thread-safe. Its methods can be accessed concurrently by multiple threads 
//	 in an unsafe manner if not managed correctly.
	
	// Performance:
	/*
	 * StringBuffer: Due to the overhead of synchronization, StringBuffer may
	 *  be slower than StringBuilder when used in a single-threaded context.
	 *  
	 * StringBuilder: Typically faster in scenarios where thread safety isn't a
	 * concern, since it doesn't have the overhead of synchronization.
	 */
	
	

}

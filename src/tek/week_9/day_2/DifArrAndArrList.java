package tek.week_9.day_2;
	
	public class DifArrAndArrList {
		

		
		// Size:
		/*    Array: Has a fixed size. Once it's created, you cannot change its
		 * 	  size without creating a new array and copying elements.
		   
		    ArrayList: Is dynamic. It can grow or shrink as needed. 
		    Underlying, it uses an array, but it manages resizing automatically.   
	*/
		
	/*	Type:
		    Array: Can store both primitives (like int, char, boolean) and 
		    objects (like String, Integer, custom objects).
		    
		    ArrayList: Stores only objects. Even if you want to store primitive 
		    data types, they will be autoboxed into wrapper classes 
		    (like int becomes Integer).
	*/
		
	/*
	 * Performance:
	 * 
	 * Array: Generally faster and requires less memory because there's no overhead
	 * of additional methods and properties associated with ArrayList.
	 *  
	 * ArrayList: Might introduce some overhead because of its dynamic 
	 * nature and the additional methods it offers.
	 */
		
	/*
	 * Memory:
	 * 
	 * Array: Uses less memory as it only stores values.
	 * 
	 *  ArrayList: Uses more memory than an array because, 
	 *  for each element, it has an additional overhead 
	 *  of storing the data about the size and other properties.
	 */

}

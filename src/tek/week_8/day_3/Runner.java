package tek.week_8.day_3;

	public class Runner {
		
		/*
		 * // * 4. Testing: In your main method, create instances of 
		 * Dog and Cat 
		 * and call their // * makeSound() methods to observe the overridden 
		 * behavior. //
		 */
		public static void main(String[] args) {
//			var animalObj = new Animal();
			var dogObj = new Dog();
			var  catObj = new Cat();
			
		
//			animalObj.makeSound();
			dogObj.makeSound();
			catObj.makeSound();
		}
		

}

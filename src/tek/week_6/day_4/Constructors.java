package tek.week_6.day_4;

	public class Constructors {

		public String name;
		public String lastName;
		public int age;
		public int salary;
		

	// ************************BELOW -  Chaining Constructors************
		public Constructors() {
			// defaul constructor
			this("Jonh", "Galey");
		}
		public Constructors(String name, String lastName) {
			// parameterized constructor
			this.name = name;
			this.lastName = lastName;
		}
		// ************************ ABOVE - Chaining Constructors************
		public Constructors(String name, String lastName, int age, int salary) {
	//Constructor overloading
			this.age = age;
			this.salary = salary;
			this.name = name;
			this.lastName = lastName;

		}
		
		public Constructors( String lastName, int age, int salary) {
					this.age = age;
					this.salary = salary;
					this.lastName = lastName;
			}

		public void printValues() {

			System.out.println("FirstName: " + name + " LastName: " + lastName);
		}
		
		
		//1. create a class named "Area"
		//2. define default constructor
		//3. define a parameterized constructor
		//3. Add operations to find area of a rectangel 
		//(you will need other methods beside constructor)
		//4. Create another class 
		//5. Create object of "Area" Class
		//6. print area of a rectange
		

}

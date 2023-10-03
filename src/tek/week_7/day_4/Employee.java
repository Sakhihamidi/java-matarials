package tek.week_7.day_4;

	
	public class Employee {
		// 1.Create an Employee Class
		// 2.Which will have name, lastName
		private String name;
		private String lastName;
		// 3.generate the getter and setter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		// 4. Generate the parameterize constructor
		public Employee(String name, String lastName) {
			this.name = name;
			this.lastName = lastName;
		}
		// 5. Create one method of type void that will print the name & lastName 
		//in the following format.
		// Name: X
		// Last Name: Y
		// Where X is the value of name & Y is the value of lastName.
		void print() {
			System.out.println("Name: " + getName());
			System.out.println("Last Name: " + getLastName());
		}	
	}
	

}

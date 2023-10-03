package tek.week_7.day_4;

	
	public class EmployeeSalary extends Employee {
		// 1.Create another class -> EmployeeSalary
		// 2.Create one field of double and name it salary.
		private double salary;
		// 3. Generate the getter and setter method for salary.

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		// 4. Create the parametrized constructor for Class EmployeeSalary.
		public EmployeeSalary(String name, String lastName, double salary) {
			super(name, lastName);
			this.salary = salary;
		}
		// 5. Create one method of double that will calculate wage
		// this method should accept base salary plus hourly Rate.
		double calculateWage(double hourlyRate) {
			return getSalary() * hourlyRate;
		}
		// 6.Inherit the properties of the class Employee
	}
	
	


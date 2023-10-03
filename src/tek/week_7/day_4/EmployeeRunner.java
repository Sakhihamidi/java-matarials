package tek.week_7.day_4;

public class EmployeeRunner {

	
			// 7. Create runner class & create instance of the child class
			// 8. Call the wage method and print the wage.
			public static void main(String[] args) {
				var empSalObj = new EmployeeSalary("Bob", "Smith", 65_000);
				System.out.println(empSalObj.calculateWage(20));
				empSalObj.print();
				
				String a = "";
			}
		
		

	}


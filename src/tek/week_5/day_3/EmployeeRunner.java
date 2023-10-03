package tek.week_5.day_3;

public class EmployeeRunner {		
	
	public static void main(String[] args) {		

		/*
		 * In the context of object-oriented programming, an object is an 
		 * instance (copy) of a class. When a class is defined, no memory 
		 * is allocated but when it is instantiated 
		 * (i.e., an object is created) memory is allocated.
		 */
		
	// Object of classEmployee created and method printifo called
			
		Employee employeeObj = new Employee();
		
		employeeObj.firstName = "Alex";
		employeeObj.lastName = "Curreto";
		employeeObj.printInfo();
		

	// another Object of classEmployee created and method printifo called

		Employee secondEmployeeObj = new Employee();
		employeeObj.firstName = "Second Employee";
		employeeObj.lastName = "Second Employee last Name";
		employeeObj.printInfo();
		
	// method printinfo from class vehicle information is called
		VehicleInformation.printCarInfo();
		
		ReviewActivity VInfoObj = new ReviewActivity();
		ReviewActivity.firstName = " Ahmad";
		ReviewActivity.lastName = "Ahmadi";
		ReviewActivity.printFirstLast();
	}
		

	}




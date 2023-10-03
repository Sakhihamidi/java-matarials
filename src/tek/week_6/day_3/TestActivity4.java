package tek.week_6.day_3;

import java.util.Scanner;

public class TestActivity4 {

	public static void main(String[] args) {
//Write a java program with following steps:
//I. Using the Scanner, ask the user to enter five city names. the message should be as follow:
//1. "Please enter city name".
		Scanner userCityInput = new Scanner(System.in);

//II. Create an array of type String and name the variable cityNames. The array should be size of 5

		String[] cityNames = new String[5];
		
//III. Use for loop to loop through the length of cityNames as long as it is true.
//1. Assign each value that the user enters to the cityNames.
// **HELP: cityNames[i] = input.nextLine(); **
//**NOTE: 
//  1. Input: Is the name of Scanner, you need to call whatever you 
//  named your Scanner!
//  2. Step I should be before the loop.
//  **
		
		for(int i =0; i<cityNames.length; i++) {
			System.out.println("Please enter city name");
			cityNames[i] = userCityInput.nextLine();
		}
		
		
//IV. Now you have all of the entered values stoped in cityNames, Create another for loop to go through the cityNames array.
// 1. Declare another variable of type String and name it cities. 
//This variable should have the each value that the loops goes through the   cityNames.
//  **HELP: cities = cityNames[i]; **
		
	    for(int i = 0; i<cityNames.length; i++) {
	    	String cities = cityNames[i];
	    
	    
// 2. Write an if statement that if cities starts with letter "D", print  them in console. 
//You need to use startswith() method with your cities inside if statement.
		if(cities.startsWith("D")) {
    		System.out.println(cities);
    	}
    }
	    userCityInput.close();
	
		
//V. Run your program.
//	** Hint: Look at the below expected output. **
// NOTE: Do not append anything to output. Test will fail if you append text.
//	NOTE: Do not include "Please enter city name" inside first loop. (Test will fail)
		
		
		
}

}

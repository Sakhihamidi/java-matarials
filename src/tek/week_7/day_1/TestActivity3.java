package tek.week_7.day_1;

public class TestActivity3 {

	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
//* Write a java program with following steps:
// * I. You are given following arrays:
//* 1. evenNumberArray = { 13, 25, 58, 42, 34, 27, 65, 18 }; 2. oddNumberArray =
//* { 23, 34, 21, 43, 98, 11, 16 };

		int [] evenNumber = { 13, 25, 58, 42, 34, 27, 65, 18};
		int [] oddsNumber = { 23, 34, 21, 43, 98, 11, 16};


//* II. Write a for each loop to go through the first array.
//* 1. Find and sum all even numbers and store it in a variable called evenSum.
		for (int number:evenNumber) {
			if(number % 2 ==0) {
			evenSum +=number;
			}
		}
		
//* III. Write another for each loop to go through the second array.
// * 1. Find and sum all odd numbers and store it in a variable called oddSum.
		
		for (int number:oddsNumber) {
			if(number % 2 !=0) {
			oddSum +=number;
		}
		}
	 
//* IV. Declare another variable and store the sum of evenSum and oddSum
	int totalSum = oddSum + evenSum;
 
// * V. Print the value of the variable that holds the result of oddSum and
// * evenSum.
	System.out.println(totalSum);
	
//* NOTE: Please select the correct name and data types for the above variables.
// * Expected Output 250
	
	}

}

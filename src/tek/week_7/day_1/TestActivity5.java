package tek.week_7.day_1;

public class TestActivity5 {
	public static void main(String[] args) {

//Write a java program with following steps:

//I. Declare a 2D array of type integer and store the following values.
//  1.  10 20 30 
//      40 50 60
		int[][] numbers = { { 10, 20, 30 }, { 40, 50, 60 } };

//II. Use loop to print the above array as shown.

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("+++++++++++++++++++++++++++++++++");
		// another way of printing original 2D array
		for (int[] row : numbers) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

// III. After printing the array, traverse the array and print it as follow.
//	  1.  10 40 
//        20 50 
//        30 60

		int row = numbers.length;
		int col = numbers[0].length;
		int[][] traverseArray = new int[col][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				traverseArray[j][i] = traverseArray[i][j];
				
			}
		System.out.println(traverseArray);

		}

//		** Hint: Look at the below expected output. **
//			Expected Output
//		Original Array:
//			10 20 30
//   		40 50 60

//		After traversing the array:
//			10 40
//   		20 50
//  		30 60

	}

}

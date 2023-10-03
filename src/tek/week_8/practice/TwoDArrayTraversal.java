package tek.week_8.practice;

	public class TwoDArrayTraversal {
	    public static void main(String[] args) {
	        // Step I: Declare and initialize the 2D array
	        int[][] originalArray = {
	            {10, 20, 30},
	            {40, 50, 60}
	        };
	        
	        // Step II: Print the original array
	        System.out.println("Original Array:\n");
	        printArray(originalArray);
	        
	        // Step III: Traverse and print the array in the desired format
	        System.out.println("\nAfter traversing the array:\n");
	        transposeAndPrint(originalArray);
	    }
	    
	    // Method to print a 2D array
	    public static void printArray(int[][] arr) {
	        for (int[] row : arr) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    // Method to transpose and print the array in the desired format
	    public static void transposeAndPrint(int[][] arr) {
	        int numRows = arr.length;
	        int numCols = arr[0].length;
	        
	        for (int col = 0; col < numCols; col++) {
	            for (int row = 0; row < numRows; row++) {
	                System.out.print(arr[row][col] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

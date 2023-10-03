package tek.week_7.day_1;

public class TestActivity6 {
	
	    public static void main(String[] args) {
	        int[][] originalArray = {
	            {10, 20, 30},
	            {40, 50, 60}
	        };

	        System.out.println("Original Array:");
	        printArray(originalArray);

	        System.out.println("\nAfter traversing the array:");
	        int[][] transposedArray = transposeArray(originalArray);
	        printArray(transposedArray);
	    }

	    public static void printArray(int[][] array) {
	        for (int[] row : array) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int[][] transposeArray(int[][] array) {
	        int numRows = array.length;
	        int numCols = array[0].length;
	        int[][] transposed = new int[numCols][numRows];

	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < numCols; j++) {
	                transposed[j][i] = array[i][j];
	            }
	        }

	        return transposed;
	    }
	
}

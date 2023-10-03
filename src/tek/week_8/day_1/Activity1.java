package tek.week_8.day_1;

public class Activity1 {

	public static void main(String[] args) {
		
		int towDArray[][] = { { 10, 20, 30 },
							  { 40, 50, 60 } };
		
		
		for (int i = 0; i < towDArray.length; i++) {
			for (int j = 0; j < towDArray[i].length; j++) {
				System.out.print(towDArray[i][j] + " ");

			}
			System.out.println();
		}
	

	   
        for (int j = 0; j < towDArray[0].length; j++) {
            for (int i = 0; i < towDArray.length; i++) {
                System.out.print(towDArray[i][j] + " ");
            }
            System.out.println();
        }}
}

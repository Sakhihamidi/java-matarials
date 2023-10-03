package tek.week_4.day_1;

public class Array {
	
	public static void main (String []args) {
			
		String [] names = new String[3];
		names[0] = "Bob";
		names[1] = "John";
		names[2] = "Eric";

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		
		System.out.println("----------------------------------------");
		// lets make it so simpler
		// to print in one sysout with diffrent lines: "\n"
		String [] names1 = {"Bob", "John", "Eric"};
		
		System.out.println(names[0] + names[1] + names[2]);

		System.out.println(names[0] +"\n" + names[1] + "\n" + names[2]);
		
		System.out.println("----------------------------------------");
		
		
		int [] numbers = new int [5];
		numbers [0] = 10;
		numbers [1] = 20;
		numbers [2] = 30;
		numbers [3] = 40;
		numbers [4] = 50;
		System.out.println(numbers[0]);
		
		

		

	}

}

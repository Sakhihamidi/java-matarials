package tek.week_8.practice;

public class EncapsukationRunner {

	public static void main(String[] args) {
		
		Encapsulation encObj = new Encapsulation();
		
		encObj.setNumberOne(50);
		encObj.setNumberTwo(70);
		
		encObj.printSume();
		
		
		Encapsulation encObj1 = new Encapsulation();
		
		encObj1.setNumberOne(2);
		encObj1.setNumberTwo(3);
		
		encObj1.printSume();
		
		
		System.out.println(encObj1.getNumberOne());

	}

}

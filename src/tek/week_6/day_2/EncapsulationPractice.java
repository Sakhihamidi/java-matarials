package tek.week_6.day_2;

public class EncapsulationPractice {
	
	private double numberOne;
	private int numberTwo;
	
	public double getNumberOne() {
		return numberOne;
	}
	
	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}
	
	public int getNumberTwo() {
		return numberTwo;
	}
	
	public void setNumberTwo(int numberTwo) {
		this.numberOne = numberTwo;
	}
	
	
//	public EncapsulationPractice(int numberOne, int numberTwo) {
//		this.numberOne = numberOne;
//		this.numberTwo = numberTwo;
//	}

	private double calculateSum() {
		return numberOne + numberTwo;
	}
	
	public void printSum() {
		System.out.println(numberOne + " + " + numberTwo + " = " +	calculateSum());
	}
	

}

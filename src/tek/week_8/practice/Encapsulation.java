package tek.week_8.practice;

public class Encapsulation {

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
		this.numberTwo = numberTwo;
	}
	
	public double sumNumber() {
		return numberOne + numberTwo;
	}
	
	public void printSume() {
		System.out.println(sumNumber());
	}
	}
	


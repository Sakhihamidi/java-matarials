package tek.week_6.day_2;

public class TestActivity {
	
	private int num1;
	private int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}	
	
	private double calculateSum() {
		return num1 + num2;
	}
	
	public void printSum() {
		System.out.println(calculateSum());
	}
		
	
	
	
	

}

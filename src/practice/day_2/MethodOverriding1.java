package practice.day_2;

public class MethodOverriding1 {
// Simply Overriding means to have the parend class method in child class.
	
	public static void main(String[] args) {
		
		AdvanedCalculator AdCalObj = new AdvanedCalculator();
		int r = AdCalObj.add(3, 5);
		System.out.println(r);
	}

}

class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	
}

class AdvanedCalculator extends Calculator{
	public int add(int a, int b) {
		return a+b+1;
	}
	
}
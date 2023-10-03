package tek.week_2.day_3;

public class Activity1 {
	// find area of rectangle with h = 4inch and w 6inch
	// in CM
	public static void main(String[] args) {
		// area = ( (h * 2.54) * (w * 2.54));
		double hightInInch = 4;
		double widthInInch = 6;
	
		double hightInCm = hightInInch * 2.54;
		double widthInCm = widthInInch * 2.54;
		
		
		double areainCM = hightInCm * widthInCm;
		System.out.println(areainCM);
		
		double areaInInch = hightInInch * widthInInch;
		System.out.println(areaInInch);
		

	}
}
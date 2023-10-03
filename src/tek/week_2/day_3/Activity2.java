package tek.week_2.day_3;

import java.text.DecimalFormat;

public class Activity2 {

	// find area of Circle with radius 2.43 CM (result in CM)
	public static void main(String[] args) {
		// area of Circle = pi * (r * r)
		double radius = 2.43;
		double pi = Math.PI; // Math Library from Java to get PI value

		double area = pi * (radius * radius);
		// Out of Topic Formatting Decimal Numbers.
		
		DecimalFormat formatter = new DecimalFormat("#.####");
				
		System.out.println("Area of Circle " + formatter.format(area));
				
	}

}

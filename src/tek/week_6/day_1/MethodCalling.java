package tek.week_6.day_1;

public class MethodCalling {
	
	  public static void main(String[] args) {

		    double area = calculateArea(6,4);
		    double perimeter = calculatePerimeter(6, 4);

		    System.out.println("The length of the rectangle is: " + area);
		    System.out.println("The perimeter of the rectangle is: " + perimeter);
		 
		  }

		  public static double calculateArea(double length, double width) {
		        return length * width;
		    }

		    public static double calculatePerimeter(double length, double width) {
		        return 2 * (length + width);
		    }
		}




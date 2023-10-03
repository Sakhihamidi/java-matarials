package tek.week_6.day_4;

	
	public class Runner_Constructor {

		public static void main(String[] args) {

			Constructors obj1 = new Constructors();

			System.out.println();
			obj1.printValues();

			Constructors obj2 = new Constructors("John", "Doe");
			
			Constructors obj3 = new Constructors("Jane", "Joseph", 40, 20000);
			Constructors obj4 = new Constructors( "Joseph", 40, 20000);
			
			
			//Find Area of rectange
			
			AreaOfRectangle rectangle = new AreaOfRectangle(20, 20);
			
			System.out.println("Area of rectangle is : "+rectangle.getArea());
			
			
			RadiusOfCircle rad = new RadiusOfCircle(100);
			
			System.out.println("Radius of Circle  is  : "+rad.getRadius());
			
			
			
		}
		

}

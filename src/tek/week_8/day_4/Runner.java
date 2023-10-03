package tek.week_8.day_4;
	
	public class Runner {
		
		public static void main(String[] args) {
			
			var shapeObj = new Shape("Red");
			
			var cirObj = new Circle("Red", 3.0);
			var recObj = new Rectangle("Blue", 4.0, 7.0);
			
			System.out.println("Circle Area: " + cirObj.getArea());
			System.out.println("Circle Primeter: " + cirObj.getPerimeter());
			System.out.println("Circle Color: " + cirObj.getColor());
			
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * ");
			
			System.out.println("Rectangle Area: " + recObj.getArea());
			System.out.println("Rectangle Primteter: " + recObj.getPerimeter());
			System.out.println("Rectangle Color: " + recObj.getColor());
			
			System.out.println(Sample.name);
			
		}
		

}

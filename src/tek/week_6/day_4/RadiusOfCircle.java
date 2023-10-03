package tek.week_6.day_4;

	
	public class RadiusOfCircle {

		double radius;
		float diameter;

		public RadiusOfCircle(double area) {

			this.radius = Math.sqrt(area / Math.PI);

			// PI value = 3.14

		}

		public RadiusOfCircle( float radius) {

			this.diameter = radius * 2;

			// PI value = 3.14

		}

		public double getRadius() {
			return radius;
		}

		public double getDiameter() {
			return diameter;
		}

		public static void main(String[] args) {
			RadiusOfCircle rad = new RadiusOfCircle(100);

			System.out.println("Radius of Circle  is  : " + rad.getRadius());
		}

		

}

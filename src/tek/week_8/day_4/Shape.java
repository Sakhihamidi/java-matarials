package tek.week_8.day_4;
	
	public class Shape {
		
		private String color;
		
		public Shape(String color) {
			setColor(color);
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public void displayColor() {
			System.out.println("Color of shape is: " + getColor());
		}
		

}

package tek.week_8.day_4;

public class Circle extends Shape implements InterfaceTwo {

	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// Implmentation of the Area in the circle class.
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		// Implementation of the Permiter in the circle class.
		return 2 * Math.PI * radius;
	}
}

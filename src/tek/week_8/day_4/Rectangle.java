package tek.week_8.day_4;
	
public class Rectangle extends Shape implements InterfaceTwo {
	
	private double length;
	private double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		setLength(length);
		setWidth(width);
	}
	
	public double getLength() {return length;}
	
	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length * width);
	}
		

}

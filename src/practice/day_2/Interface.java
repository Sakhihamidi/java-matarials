package practice.day_2;

public interface Interface {
	/*
	 * An interface in Java looks similar to a class but both the interface and
	 * class are two different concepts. An interface can have methods and variables
	 * just like the class but the methods declared in interface are by default
	 * abstract. We can achieve 100% abstraction and multiple inheritance in Java
	 * with Interface.
	 */

	// The method in the interfaces are going to be abstract by default.
	// The fields (variables) are going to be final and static in the
	// interfaces.

	// Class -> Class = extends
	// Class -> Interface = implements
	// Inteface -> Inteface = extends
	
	
	// Define an interface named "Shape"
	interface Shape {
	    double getArea(); // An abstract method declaration
	    double getPerimeter(); // Another abstract method declaration
	}

	// Implement the interface in a class named "Circle"
	class Circle implements Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    @Override
	    public double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }
	}

	// Implement the interface in a class named "Rectangle"
	class Rectangle implements Shape {
	    private double width;
	    private double height;

	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    public double getArea() {
	        return width * height;
	    }

	    @Override
	    public double getPerimeter() {
	        return 2 * (width + height);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5.0);
	        Rectangle rectangle = new Rectangle(4.0, 6.0);

	        System.out.println("Circle Area: " + circle.getArea());
	        System.out.println("Circle Perimeter: " + circle.getPerimeter());

	        System.out.println("Rectangle Area: " + rectangle.getArea());
	        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
	    }
	}



}

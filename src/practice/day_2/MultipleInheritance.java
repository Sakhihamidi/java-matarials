package practice.day_2;

public class MultipleInheritance {
	
	// Define two interfaces
	interface Animal {
	    void eat();
	}

	interface Mammal {
	    void move();
	}

	// Implement the interfaces in a class
	class Dolphin implements Animal, Mammal {
	    @Override
	    public void eat() {
	        System.out.println("Dolphin is eating fish.");
	    }

	    @Override
	    public void move() {
	        System.out.println("Dolphin is swimming in the water.");
	    }
	}

	public class MultipleInheritanceExample {
	    public static void main(String[] args) {
	        Dolphin dolphin = new Dolphin();
	        dolphin.eat();
	        dolphin.move();
	    }
	}


}

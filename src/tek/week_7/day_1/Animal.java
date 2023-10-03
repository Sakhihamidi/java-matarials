package tek.week_7.day_1;

public class Animal {
/*
 * Base Class - Animal: 
 * Properties: name. 
 * Methods: makeSound(): This will print "This animal makes a sound." 
 * A constructor to initialize the name property.
 * 
 * */

private String name;

public Animal(String name) {
	this.name = name;
}

void makeSound() {
	System.out.println("This animal makes a sound.");

	}

}

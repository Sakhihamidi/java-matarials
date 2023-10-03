package practice.day_2;

public class MethodOverriding3Polymorphism {
	public static void main(String[] args) {
		
	Animal aniObj = new Animal ();
	aniObj.sound();
	
	Dog dogObj = new Dog();
	dogObj.sound();
	
	Cat catObj = new Cat();
	catObj.sound();
		
	}
}

class Animal{
	public void sound() {
		System.out.println("Animal Sounds");
	}
		
}

class Dog extends Animal{
	public void sound() {
		System.out.println("Bark Bark! Wow Wow!");
	}
	
}

class Cat extends Animal{
	
	public void sound() {
		System.out.println("Mwe Mew!");
	}
}
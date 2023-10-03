package practice.day_2;

public class AbstracrtionExample {
	public static void main(String[] args) {
			
	ElectricCar electricObj = new ElectricCar();
	
	electricObj.StartEngine();
	electricObj.honk();
	electricObj.StopEngine();
	
	System.out.println("* * * * * * * * * * * * * * * * * * * * ");
	
	GasCar gasCarObj = new GasCar();

	gasCarObj.StartEngine();
	gasCarObj.honk();
	gasCarObj.StopEngine(); 

}
}

abstract class Car4{
	public abstract void StartEngine();
	public abstract void StopEngine();
	
	public void honk() {
		System.out.println("The car honks.");
	}
	
}
class GasCar extends Car4{

	@Override
	public void StartEngine() {
		// TODO Auto-generated method stub
		System.out.println("The Gas car is Starts Loudly");
	}

	@Override
	public void StopEngine() {
		System.out.println("The Gas car is Stops Loudly");
		
	}
	
	
}

class ElectricCar extends Car4{

	@Override
	public void StartEngine() {
		System.out.println("The Electric car is Starts Silently");
		
	}

	@Override
	public void StopEngine() {
		System.out.println("The Electric car is Stops Silently");
		
	}
	
}
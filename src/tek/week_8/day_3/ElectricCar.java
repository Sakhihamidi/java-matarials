package tek.week_8.day_3;
	
	
	public class ElectricCar extends Car {

		@Override
		public void StartEngine() {
			System.out.println("The Electric car is starts silently.");
		}

		@Override
		public void StopEngine() {
			System.out.println("The Electric car is Stops silently.");
		}
		

}

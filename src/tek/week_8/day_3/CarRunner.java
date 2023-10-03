package tek.week_8.day_3;
	
	public class CarRunner {
		
		public static void main(String[] args) {
			
			var electricObj = new ElectricCar();
			var gasCarObj = new GasCar();
			
			electricObj.StartEngine();
			electricObj.honk();
			electricObj.StopEngine();
			
			System.out.println();
			System.out.println("* * * * * * * * * * * * * * * * * * * * ");
			
			gasCarObj.StartEngine();
			gasCarObj.honk();
			gasCarObj.StopEngine();
		}
		

}

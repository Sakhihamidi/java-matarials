package tek.week_7.day_2;

	public class SmartPhone {
		/*
	  	1. Create a Base Class (PARENT) - Smartphone:
	    This class should have Properties: brand, OS, batteryCapacity.
	    Methods: call(): Prints "Making a call...".
	    sendMessage(): Prints "Sending a message...".
	    A constructor to initialize the common properties.
	    */
		
		private String brand;
		private String OS;
		private String batteryCapacity;
		
		public SmartPhone(String brand, String oS, String batteryCapacity) {
			this.brand = brand;
			this.OS = oS;
			this.batteryCapacity = batteryCapacity;
		}
		
		public void call() {
			System.out.println("Making a call...");
		}
		
		public void sendMessage() {
			System.out.println("Sending a message...");
		}
		
		

}

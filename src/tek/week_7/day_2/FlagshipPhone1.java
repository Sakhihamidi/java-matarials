package tek.week_7.day_2;

public class FlagshipPhone1 extends SmartPhone {
				
	/*
	 * 2. Derived Class (CHILD-1) : FlagshipPhone
	 * 
	 * Inherit from the Smartphone class.
	 * 
	 * The property of this class should be cameraQuality.
	 * 
	 * And a method sendMessage(): print " Sending a high-quality photo message"
	 */
		
		public String cameraQuality;
		
					
		/*
		 * public FlagshipPhone1(String brand, String oS, String batteryCapacity) {
		 * super(brand, oS, batteryCapacity); this.cameraQuality = cameraQuality;
		 */

		public FlagshipPhone1(String brand, String oS, String batteryCapacity, String cameraQuality) {
			super(brand, oS, batteryCapacity);
			this.cameraQuality = cameraQuality;
		}

	

		public void sendMessage() {
			System.out.println("Sending a high-quality photo message");
		}
	

}

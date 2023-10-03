package tek.week_7.day_2;

	
	public class GamingPhone extends SmartPhone {
		
		/*
		 4. Derived Class (CHILD-3): GamingPhone Inherit from the Smartphone class.
		 The property of this class should be GPU. 
		 And a method sendMessage(): print "Sending a Gaming photo message"
		 */
		
		private String GPU;
		
		public GamingPhone(String brand, String oS, String batteryCapacity, String gPU) {
			super(brand, oS, batteryCapacity);
			this.GPU = gPU;
		}

		public void sendMessage() {
			System.out.println("Sending a Gaming photo message");
		}
		

}

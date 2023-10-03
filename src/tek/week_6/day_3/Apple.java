package tek.week_6.day_3;


	public class Apple extends SmartPhone{
		
		private String operatingSystem;
		private String appleId;
		
		public String getOperatingSystem() {
			return operatingSystem;
		}
		public void setOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
		}
		public String getAppleId() {
			return appleId;
		}
		public void setAppleId(String appleId) {
			this.appleId = appleId;
		}
		
		public void printOperatingSystem() {
			System.out.println("The OS is: " + getOperatingSystem());
		}
		
		public void printAppleId() {
			System.out.println("The ID is: " + getAppleId());
		}
		
	}



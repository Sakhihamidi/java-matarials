package tek.week_8.day_2;
	
	public class Bike extends Vehicle {
		
		private String make;
		private int speed;
		
		public Bike(int numberOfDoors, String make, String make2, int speed) {
			super(numberOfDoors, make);
//			this.make = make2;
//			this.speed = speed;
			setMake(make2);
			setSpeed(speed);
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		public void printSpeed() {
			System.out.println(speed);
		}
		
		public void printMake() {
			System.out.println(getMake());
		}
		

}

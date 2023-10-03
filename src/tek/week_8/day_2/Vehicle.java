package tek.week_8.day_2;

	public class Vehicle {
		
		private int numberOfDoors;
		private String make;
		
		public Vehicle(int numberOfDoors, String make) {
			this.numberOfDoors = numberOfDoors;
			this.make = make;
		}

		public int getNumberOfDoors() {
			return numberOfDoors;
		}

		public void setNumberOfDoors(int numberOfDoors) {
			this.numberOfDoors = numberOfDoors;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}
		
		public void printMake() {
			System.out.println(make);
		}
		
		public void printNumberOfDoors() {
			System.out.println("VEHICLE DOORS");
		}
		

}

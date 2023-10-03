package tek.week_7.day_1;

	public class Car extends Vehicle{
		// Part 2.
		/*
	 * Create another subclasses called Car that inherit from the Vehicle class: 
		 * Car with an additional property numberOfDoors and a 
		 * method honk() which prints "Car honk!". 
		 */
		
		private int numberOfDoors;
		
		public Car(String brand, String model, int yearOfManufacture, int numberOfDoors) {
			super(brand, model, yearOfManufacture);
			this.numberOfDoors = numberOfDoors;
		}

		public int getNumberOfDoors() {
			return numberOfDoors;
		}

		public void setNumberOfDoors(int numberOfDoors) {
			this.numberOfDoors = numberOfDoors;
		}
		
		public void honk() {
			System.out.println("Car honk!");
		}

}

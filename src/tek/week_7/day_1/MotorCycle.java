package tek.week_7.day_1;


	public class MotorCycle extends Vehicle {
		// Part 3.
		/*
		 * Create another subclass called MotorCycle
		 * This class will have a properties: displayInfo() or rev() 
		 * hasSidecar as it's field.
		 * Create the constructor as well.
		 */	
		// Expected OUTPUT!
//		Brand: Harley, Model: Davidson, Year: 2022
//		Motorcycle revs!
		
		private int numberofTires;
		
		public MotorCycle(String brand, String model, int yearOfManufacture, int numberofTires) {
			super(brand, model, yearOfManufacture);
			this.numberofTires = numberofTires;
		}

		public int getNumberofTires() {
			return numberofTires;
		}

		private void setNumberofTires(int numberofTires) {
			this.numberofTires = numberofTires;
		}
		
		public void rev() {
			System.out.println("Motorcycle revs!");
		}
		

}

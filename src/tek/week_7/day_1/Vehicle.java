package tek.week_7.day_1;

public class Vehicle {
	
	// Part 1.
		/*
		 * Create a base class Vehicle with the following properties and methods:
		 * Properties: brand, model, and yearOfManufacture. 
		 * A parameterized constructor to initialize the properties.
		 * Method: displayInfo() which prints the details of the vehicle. 
		 */
		
		private String brand;
		private String model;
		private int yearOfManufacture;

		public Vehicle(String brand, String model, int yearOfManufacture) {
			this.brand = brand;
			this.model = model;
			this.yearOfManufacture = yearOfManufacture;
		}
		
		public String getBrand() {
			return brand;
		}
		
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		public String getModel() {
			return model;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public int getYearOfManufacture() {
			return yearOfManufacture;
		}
		
		public void setYearOfManufacture(int yearOfManufacture) {
			this.yearOfManufacture = yearOfManufacture;
		}
		

		public void displayInfo() {
			System.out.println("Brand: " + brand + " Model: " + model + " YOM: " + yearOfManufacture);
		}
		
		

}

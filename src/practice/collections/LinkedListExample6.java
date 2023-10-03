package practice.collections;

import java.util.LinkedList;

public class LinkedListExample6 {
	
	// Create main method and create instance of the class VehicleManager
		// Call the custom methods and perform the operations.

		public static void main(String[] args) {

			var vehicleObj = new VehicleManager();
			vehicleObj.printVehicles();

			vehicleObj.addVehicle("Toyota");
			vehicleObj.addVehicle("BMW");
			vehicleObj.addVehicle("Honda");

			vehicleObj.printVehicles();

			vehicleObj.removeVehicle("Honda");

			vehicleObj.printVehicles();

		}


}


class VehicleManager {
	
	// Create a class called VehicleManager
	// Create an LinkedList
	LinkedList<String> vehicles = new LinkedList<>();
	// Create a constructor that is going to initialize the linkedList
	/*
	 * public VehicleManager() { vehicles ; }
	 */
	// Create methods of your choice to perform custom operations like add or
	// delete.
	
	void addVehicle(String name) {
		vehicles.add(name);
	}
	
	void removeVehicle(String name) {
		vehicles.remove(name);
	}
	
	void printVehicles() {
		System.out.println("List of available vehicles:");
		for (String v : vehicles) {
			System.out.println(v);
		}
	}
}

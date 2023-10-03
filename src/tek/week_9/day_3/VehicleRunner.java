package tek.week_9.day_3;

public class VehicleRunner {
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

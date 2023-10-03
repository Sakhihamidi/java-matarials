package tek.week_7.day_2;

public class BudgetPhone extends SmartPhone{
	
	/*
	 * 3. Derived Class (CHILD-2): BudgetPhone Inherit from the Smartphone class.
	 * The property of this class should be BudgetPhone. 
	 * And a method sendMessage(): print "Sending a budget photo message"
	 */
	
	private String BudgetPhone;
	
	
	
	public BudgetPhone(String brand, String oS, String batteryCapacity, String budgetPhone) {
		super(brand, oS, batteryCapacity);
		this.BudgetPhone = budgetPhone;
	}


	public void sendMessage() {
		System.out.println("Sending a budget photo message");
	}
}




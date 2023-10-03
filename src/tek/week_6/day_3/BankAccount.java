package tek.week_6.day_3;

public class BankAccount {
	// Encapsultation Activity
		// 1. Create a java class and name it BankAccount
		
		// 2. This class should have one private field called balance
		// and the data type should be double.
		
		private double balance;
		
		// 3. Decide which type of constructor needs to be created and create the 
		// the required constructor.
		
		public BankAccount(double balance) {
			if (balance < 0) {
				System.out.println("Cannot deposit negative balance.");
			} else {
				this.balance = balance;
			}
		}
		
		// 4. Create one method called deposit that will accept one parameter of
		// type double and you can call it amount.
		// This method should take the amount and add it to balance.
		
		public void deposit(double amount) {
//			balance = balance + amount; 
			if (amount > 0 ) {
				balance += amount;
			} else {
				System.out.println("You cannot  deposit negative value.");
			}
		}
		// 5. create another method called withdraw that will accept one parameter
		// of type double and you can name it amount.
		// This methis should subtract the amount from balance.
		
		public void withdraw(double amount) {
//			balance = balance - amount; 
			if (amount > 0 && amount <= balance) {
				balance -= amount;
			} else {
				System.out.println("Insufficeint balance or Invaliud amount.");
			}
		}
		
		// 6. Create the method getBalance() which will return the value of
		// balance
		
		public double getBalance() {
			return balance;
		}

}

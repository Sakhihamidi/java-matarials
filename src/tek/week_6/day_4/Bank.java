package tek.week_6.day_4;

	public class Bank {

		private String accountNumber;
		private double balance;

		public Bank(String newAccountNumber) {
			// parameterized constructor

			this.accountNumber = newAccountNumber;

		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public double getBalance() {
			return balance;
		}

		public void deposit(double amount) {

			if (amount > 0) {
				// balance = balance+amount;

				// -200 as deposit
				balance += amount;
			} else {

				System.out.println("You cannot deposit zero or negative amount");
			}

		}

		public void withdraw(double amount) {

			if (amount > 0 && amount <= balance) {
				// 200 = 200(balance - 100 (withdraw)
				// balance = balance - amount;
				balance -= amount;
			} else {
				System.out.println("Cannot withdraw over balance / Insuffecient funds");
			}

		}

		

}

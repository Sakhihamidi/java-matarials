package tek.week_6.day_4;

	
	public class Runner_Encapsulation {

		public static void main(String[] args) {

			Bank obj = new Bank("5646479873");
			obj.getBalance();
			System.out.println("Balance before Deposit: " + obj.getBalance());
			obj.deposit(500);
			System.out.println("Balance After Deposit: " + obj.getBalance());
			obj.withdraw(200);
			System.out.println("Balance After Withdraw: " + obj.getBalance());
			System.out.println("My Account Number: " + obj.getAccountNumber());
			obj.deposit(-200);
			System.out.println("Balance After Withdraw: " + obj.getBalance());
		}
		

}

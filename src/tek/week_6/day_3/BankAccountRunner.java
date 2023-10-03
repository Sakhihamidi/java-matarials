package tek.week_6.day_3;

public class BankAccountRunner {

	// 7. Create your main method and 
	public static void main(String[] args) {
	// 8. create the object of this class and 
		BankAccount bankAccObj = new BankAccount(2000);
	// 9. make deposite and withdraw some amount and they call the getBalance()
	// method to print the value of balance after deposit and withdraw.
		bankAccObj.deposit(-1500);
		bankAccObj.withdraw(200);
		System.out.println(bankAccObj.getBalance());
	}

}

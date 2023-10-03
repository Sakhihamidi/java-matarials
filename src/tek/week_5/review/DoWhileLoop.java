package tek.week_5.review;

public class DoWhileLoop {
	public static void main(String[] args) {

		int count = 0;

		do {

			if (count % 2 == 1) {// find remainder if it is 1 then skip

				count++;
				continue;
			}

			if (count > 30) {// if the count reaches above 30 then break / stop the loop

				break;
			}

			count++;
			System.out.println("Count: " + count);

		} while (true);// the condition after While keyword is to loop indefinite
		

}
}

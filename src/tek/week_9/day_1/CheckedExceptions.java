package tek.week_9.day_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
	// Checked Exception
	/*
	 * a checked exception is an exception that is checked at compile-time. This
	 * means that the compiler requires that the exception either be caught using a
	 * try-catch block or be declared to be thrown by the method using the throws
	 * clause. Checked exceptions typically represent situations that a well-written
	 * application should anticipate and recover from.
	 */

	public static void main(String[] args) {
//			try {
//			File file = new File("name.txt");
//			FileInputStream FiS = new FileInputStream(file);
//			}catch (Exception e) {
//				System.out.println("Result: " + e.getMessage());
//			}
		try {
			File file = new File("name.txt");
			FileInputStream FiS = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//System.out.println("Normal Flow");

	}
}

package tek.week_3.day_3;

public class SelectionExample {
	// 90 - 100 is A
		// 80 - 90 is B
		// 70 - 80 is C
		// 60 - 70 is D
		// 50 - 60 is E
		// below 50 is F
		public static void main(String[] args) {
			int score = 120;
			char grade;
			if (score > 90 && score <= 100) {
				grade = 'A';
			} else if (score > 80 && score <= 90) {
				grade = 'B';
			} else if (score > 70 && score <= 80) {
				grade = 'C';
			} else if (score > 60 && score <= 70) {
				grade = 'D';
			} else if (score > 50 && score <= 60) {
				grade = 'E';
			} else if (score >= 0 && score <=50 ) {
				grade = 'F';
			}else {
				grade = 'N';
			}
			System.out.println(grade);
					
	}

}

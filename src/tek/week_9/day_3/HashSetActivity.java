package tek.week_9.day_3;
import java.util.HashSet;

	public class HashSetActivity {
		
		public static void main(String[] args) {
			
			int[] numbers = {1,1,1,2,3,4,5,6,7,8,9,10,1,10,10,10,200,200};
			HashSet<Integer> values = new HashSet<>();
			
			for (int number : numbers) {
				values.add(number);
			}
			
			System.out.println(values);
			
			for (int index = 0; index < numbers.length; index++) {
				values.add(numbers[index]);
			}
			
			System.err.println(values);
			
		}

}

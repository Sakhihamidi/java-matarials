package tek.week_9.day_3;
import java.util.TreeSet;

public class TreeSetActivity {
	
	public static void main(String[] args) {
		
		TreeSet<Character> alphabets = new TreeSet<>();
		alphabets.add('a');
		alphabets.add('e');
		alphabets.add('z');
		alphabets.add('b');
		alphabets.add('f');
		alphabets.add('d');
		alphabets.add('c');
		
		System.out.println(alphabets);
		
		TreeSet<Integer> numbers = new TreeSet<>();
		
		for (int i = 10; i >= 0; i--) {
			numbers.add(i);
		}
		
		System.out.println(numbers);
	}
}
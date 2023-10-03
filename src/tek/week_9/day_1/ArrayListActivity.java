package tek.week_9.day_1;
	
	import java.util.ArrayList;

	public class ArrayListActivity {
		
		public static void main(String[] args) {
			ArrayList<String> names = new ArrayList<>();
			names.add("Bob");
			names.add("Erin");
			names.add("Mike");
			names.add("Trevor");
			names.add("Lydia");
			names.add("Tony");
			names.add(null);
			names.add(0, null);
			
			System.out.println(names);
			
			for (String name : names) {
				System.out.println(name);
			}
			
			// Create an ArrayList of numbers and add some values to it.
			ArrayList<Integer> numbers = new ArrayList<>();
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);
			numbers.add(40);
			numbers.add(50);
			numbers.add(60);
			numbers.add(70);
			numbers.add(80);
			numbers.add(90);
			numbers.add(100);
			numbers.add(120);
			numbers.add(10);
			System.out.println(numbers);
			// .size() is like .length();
//			for (int index = 0; index < numbers.size(); index++) {
//				System.out.println(numbers.get(index));
//			}
//			
//			System.err.println(numbers.size());
			System.out.println(numbers.remove(11));
			System.out.println(numbers);
			
		
		}

}

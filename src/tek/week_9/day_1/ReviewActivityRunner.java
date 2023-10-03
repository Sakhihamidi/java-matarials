package tek.week_9.day_1;

public class ReviewActivityRunner {
	
	/*
	 * * 5. In the main method, simulate a musical concert where various 
	 * instruments  are played.
	 */
	
	public static void main(String[] args) {
		// Creating the instance of the classes
		var piano = new Piano();
		var guitar = new Piano();
		var violin = new Piano();
		
		// Calling the methods from the paino class.
		System.out.println("******* PIANIO ************");
		piano.play();
		piano.tune();
		piano.stop();
		System.out.println("******* Guitar ************");
		guitar.play();
		guitar.tune();
		guitar.stop();
		System.out.println("******* Violin ************");
		violin.play();
		violin.tune();
		violin.stop();
		
		System.err.println(MusicalInstrument.number);
	}
	

}

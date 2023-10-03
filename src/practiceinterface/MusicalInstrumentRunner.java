package practiceinterface;

public class MusicalInstrumentRunner {
	/* 1. Create an interface named MusicalInstrument.
	    * 2. Define methods like play(), tune(), and stop().
	    * 3. Create concrete classes Piano, Guitar, and Violin implementing the MusicalInstrument interface.
	    * 4. Implement the defined methods in each class to provide
	    * specific behaviors for each instrument.
	    * 5. In the main method, simulate a musical concert where
	    * various instruments are played.
	    */
		
	public static void main(String[] args) {
		// Creating the instance of the classes
		Piano piano = new Piano();
		var guitar = new Guitar();
		var violin = new Violin();
		
		// Calling the methods from the paino class.
		System.out.println("******* PIANIO ************");
		piano.play();
		piano.tune();
		piano.stop();
		piano.sum1(2, 2); // for printing add int in sysout
		piano.sum(0, 1, 2);
		
		System.out.println("******* Guitar ************");
		guitar.play();
		guitar.tune();
		guitar.stop();
		System.out.println("******* Violin ************");
		violin.play();
		violin.tune();
		violin.stop();
		
		
		// if you want to access your variables in interface
		System.err.println(MusicalInstrument.number);
	
	}
}

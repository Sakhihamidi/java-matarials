package practiceinterface;

public class Piano implements MusicalInstrument {

		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("Playing Piano");
		}

		@Override
		public void tune() {
			// TODO Auto-generated method stub
			System.out.println("Changing the tune of the piano!");
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("Stop playing the paino.");
		}

		@Override
		public int sum1(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1 + num2;
		}

		@Override
		public int sum(int num3, int num4, int num5) {
			// TODO Auto-generated method stub
			return num3+num4+num5;
		}

	
	

}

package practiceinterface;

public class Violin implements MusicalInstrument {

		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("Violin is playing!");
		}

		@Override
		public void tune() {
			// TODO Auto-generated method stub
			System.out.println("Chaning the tune for the violin.");
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("Violin is stoped playing!");
		}

		@Override
		public int sum1(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1+num2;
		}

		@Override
		public int sum(int num3, int num4, int num5) {
			// TODO Auto-generated method stub
			return num3+num4+num5;
		}

}

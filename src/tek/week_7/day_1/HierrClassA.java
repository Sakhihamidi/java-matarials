package tek.week_7.day_1;

	
	public class HierrClassA {
		
		private String nameA;
		private int numberB;
		
		public int getNumberB() {
			return numberB;
		}

		public void setNumberB(int numberB) {
			this.numberB = numberB;
		}

		public HierrClassA(String nameA) {
//			this.nameA = nameA;
			setNameA(nameA);
//			setNumberB(numberB);
			/* System.out.println(getNameA()); */
//			System.out.println(nameA);
		}

		public String getNameA() {
			return nameA;
		}

		public void setNameA(String nameA) {
			this.nameA = nameA;
		}
		
		
		void printClassA() {
//			System.out.println(nameA);
			System.out.println(getNameA());
		}
		

}

package tek.week_7.day_1;

	
	public class HierrClassB extends HierrClassA {
		
		private String nameB;
		
		public HierrClassB (String nameA) {
			super(nameA);
			this.nameB = nameB;
		}

		public String nameB() {
			return nameB;
		}

		public void nameB(String nameB) {
			this.nameB = nameB;
		}
		
		
		void printClassB() {
			System.out.println("B");
		}
		

}

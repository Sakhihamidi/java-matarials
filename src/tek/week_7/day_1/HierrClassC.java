package tek.week_7.day_1;

	
	public class HierrClassC extends HierrClassA {
		
		private String nameC;
		
		public HierrClassC(String nameA) {
			super(nameA);
			this.nameC = nameC;
		}

		public String nameC() {
			return nameC;
		}

		public void nameB(String nameC) {
			this.nameC = nameC;
		}
		
		
		void printClassC() {
			System.out.println("C");
		}
		

}

package tek.week_7.day_1;

	
	public class HierrClassD extends HierrClassA {

		private String nameD;

		public HierrClassD(String nameA, String nameD) {
			super(nameA);
			this.nameD = nameD; 
		}

		public String getnameD() {
			return nameD;
		}

		public void nameB(String nameD) {
			this.nameD = nameD;
		}

		void printClassD() {
//			System.out.println(nameD);
			System.out.println(getnameD());
		}
		

}

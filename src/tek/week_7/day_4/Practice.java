package tek.week_7.day_4;

	
	public class Practice {
		String name = "Bob";

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void printClassName() {
			System.out.println(name.hashCode());
		}
		

}

package tek.week_8.day_2;
	
	public class Bird extends Dog{
		private String eat;

		public Bird(String eat, String eat2, String eat3) {
			super(eat, eat2);
			this.eat = eat3;
		}
		
		public String getEat() {
			return eat;
		}

		public void setEat(String eat) {
			this.eat = eat;
		}
		
		public void eat() {
			System.out.println(getEat());
		}
		

}

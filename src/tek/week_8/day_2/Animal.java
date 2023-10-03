package tek.week_8.day_2;
	
	public class Animal {
		
		private String eat;

		public Animal(String eat) {
			setEat(eat);
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

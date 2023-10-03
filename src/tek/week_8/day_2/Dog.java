package tek.week_8.day_2;

	
	public class Dog extends Animal{
		private String eat;

		public Dog(String eat, String eat2) {
			super(eat);
			this.eat = eat2;
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

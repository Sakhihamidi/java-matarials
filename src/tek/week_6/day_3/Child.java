package tek.week_6.day_3;

	
	public class Child extends Parent {
		
		private String childName;
		
		public Child (String parentName,String childName) {
			super(parentName);
			System.out.println("This child has one value " + childName );
		}
		

}

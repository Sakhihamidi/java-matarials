package tek.week_6.day_3;

	
	public class MultiLevelChildTwo extends MultiLevelChildOne {
		
		private String secondChildName;
		
		public MultiLevelChildTwo(String name,String firstChildName, String secondChildName ) {
			super(name, firstChildName);
			System.out.println("Second child have been called" + secondChildName );
		}
		

}

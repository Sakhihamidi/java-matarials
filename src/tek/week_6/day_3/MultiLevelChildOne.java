package tek.week_6.day_3;


	public class MultiLevelChildOne extends MultiLevelParent {
		
		private String childName;
		
			
		public MultiLevelChildOne(String name, String childName) {
			super(name);
			System.out.println("Firest child have been called " + childName);
		}
	}
	
	



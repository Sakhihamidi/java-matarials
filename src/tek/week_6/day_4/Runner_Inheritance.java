package tek.week_6.day_4;

	
	public class Runner_Inheritance {

		public static void main(String[] args) {
			
			
			SingleInheritanceChildTwo childTow = new SingleInheritanceChildTwo();
			
			childTow.address = "34 ST, VA"; 
			childTow.name = "John"; 
			childTow.car = "Mazda"; 
		
			
			MultiLevelInheritance multi = new MultiLevelInheritance();
			
			multi.address = "123 St NV"; //Superclass for parent Variable
			multi.car = "Benz"; //Superclass for Child Variable
			multi.multi = "Multi Level Inheritance"; // Child Variable
		
			
			
		}
		

}

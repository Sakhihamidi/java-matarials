package tek.week_7.day_3;
	
		public class Muttable {
			
			public static void main(String[] args) {
				
				String str = "Name";
				str = str + " with lastName";
				
				StringBuffer sbfmutable = new StringBuffer("Name");
				sbfmutable.append(" with lastName for String buffer");
				sbfmutable.reverse();

				System.out.println(str);
				System.out.println(sbfmutable);
			}
			

	}



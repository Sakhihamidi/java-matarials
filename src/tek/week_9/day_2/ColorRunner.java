package tek.week_9.day_2;

public class ColorRunner {
	
public static void main(String[] args) {
		
		var colorObj = new ColorManager();
		
		colorObj.addColor("Black");
		colorObj.addColor("Red");
		colorObj.addColor("Green");
		colorObj.addColor("Blue");
		colorObj.addColor("Brown");
		colorObj.addColor("Yeloo");
		colorObj.addColor("Pink");
		colorObj.addColor("");

		colorObj.printColors();
		
		colorObj.removeColor("Black");
		colorObj.removeColor("Green");
		
		colorObj.printColors();
		
		
		
	}

}

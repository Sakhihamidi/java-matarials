package tek.week_6.day_3;

public class SmartPhone {
	
	private double touchScreen;
	private int storage;
	
	public double getTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(double touchScreen) {
		this.touchScreen = touchScreen;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	public void printTouchScree() {
		System.out.println("The Screen size is: " + getTouchScreen());
	}
	
	public void printStorage() {
		System.out.println("The Storage is: " + getStorage());
	}
	

}

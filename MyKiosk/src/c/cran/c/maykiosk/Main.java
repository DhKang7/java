package c.cran.c.maykiosk;

public class Main {

	public static void main(String[] args) {
		CustomerList.run();
		ProductsList.run();
		Kiosk kiosk = new Kiosk();
		kiosk.run();
	}
}
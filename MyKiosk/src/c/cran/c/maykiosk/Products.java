package c.cran.c.maykiosk;

public class Products {
	String name;
	int price;
	boolean istime = false;
	int time;
	public int getTime() {
		return time;
	}
	Products(String name, int price, boolean istime, int time){
		this.name = name;
		this.price = price;
		this.istime =istime;
		this.time = time;
		
	}
	Products(String name, int price){
		this.name = name;
		this.price = price;
	}
}

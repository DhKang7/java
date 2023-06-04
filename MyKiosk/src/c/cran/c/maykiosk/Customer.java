package c.cran.c.maykiosk;

import java.util.ArrayList;

public class Customer {
	String ID;
	String Name;
	float timeRemain;
	int money;
	ArrayList<Products> ordered = new ArrayList<Products>();
	String timeString() {
		String v="";
		int hour = (int) timeRemain;
		int min = (int)(timeRemain%1)*60;
		v=hour+"시간 "+min+"분";
		return v;
	}
	int sum() {
		int s=0;
		for (Products i: ordered) {
			s=s+i.price;
		}
		return s;
	}

		Customer(String ID){
			this.ID = ID;
			this.timeRemain=0;
			this.money=0;
		}
		Customer(String ID, String Name, float time, int money){
			this.ID = ID;
			this.Name = Name;
			this.timeRemain = time;
			this.money = money;
		}
}

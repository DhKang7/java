package c.cran.c.maykiosk;

import java.util.ArrayList;

import com.cran.util.Cw;

public class Login {
	static Customer now;
	static public void run(){
		Cw.w("=",30);
		Cw.wn();
		Cw.wn("KIOSK PC방입니다.");
		Cw.w("=",30);
		Cw.wn();
		Cw.wn("ID를 입력 해 주세요.");
		Cw.w("=",30);
		Cw.wn();
		Kiosk.cmd=Kiosk.sc.next();
		now = CustomerList.find(Kiosk.cmd);
		Cw.wn(now.Name+"님 환영합니다.");
		now.ordered = new ArrayList<Products>();
		Cw.wn("남은 시간은 :"+Login.now.timeString()+"입니다.");
		Cw.wn(now.money+"원 충전되어 있습니다.");
		
	}

}

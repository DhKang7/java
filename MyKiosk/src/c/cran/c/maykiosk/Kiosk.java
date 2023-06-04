package c.cran.c.maykiosk;

import java.util.ArrayList;
import java.util.Scanner;

import com.cran.util.Cw;

public class Kiosk {
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	public static ArrayList<Products> carts = new ArrayList<Products>();
	Charge charge = new Charge();
	TimeCharge timecharge = new TimeCharge();
	Order order = new Order();
	ProductMan proman = new ProductMan();
	CustomMan cusman = new CustomMan();
    void run(){
    	over:while(true) {
    	if(Login.now==null) {
    		Login.run();
    	}
    	//todo 
    	//admin 계정으로 로그인 하면 관리자 메뉴로 전환
    	if(Login.now.ID.equals("admin")){
    		Cw.wn("관리 메뉴");
    		Cw.wn("1.제품 관리");
    		Cw.wn("2.고객 관리");
    		Cw.wn("3.로그아웃");
    		Cw.wn("4.종료");
    		Cw.w("=",30);
    		Cw.wn();
    		cmd=sc.next();
    		switch(cmd) {
    		case "1": 
    			proman.run();
    			break;
    		case "2":
    			cusman.run();
    			break;
    		case "3":
    			Login.now=null;
    			break;
    		case "4":
    			Cw.wn("프로그램을 종료합니다.");
    			break over;
    		default:
    			break;
    		}
    	}
    	else {
			Cw.wn("원하시는 메뉴를 선택 해 주세요.");
			Cw.wn("1.시간 충전");
			Cw.wn("2.음식 주문");
			Cw.wn("3.잔액 충전");
			Cw.wn("4.결제하기");
			Cw.wn("5.로그아웃");
			Cw.wn("6.종료");
			Cw.w("=",30);
			Cw.wn();
			cmd=sc.next();
				switch(cmd) {
					case "1": 
						timecharge.run();
						break;
					case "2":
						order.run();
						break;
					case "3":
						charge.run();
						break;
					case "4":
						Result.run();
						break;
					case "5":
						Login.now=null;
						break;
					case "6":
						Cw.wn("프로그램을 종료합니다.");
						break over;
					default:
						break;
				}
    	}
		}
	}
}


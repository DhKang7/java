package c.cran.c.maykiosk;

import com.cran.util.Cw;

public class ProductMan {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("제품관리");
		order:while(true) {
			Cw.w("=",30);
			Cw.wn();
			Cw.wn("관리 명령어");
			Cw.wn("1.상품 리스트");
			Cw.wn("2.상품 수정하기");
			Cw.wn("3.상품 제거하기");
			Cw.wn("4.상품 추가하기");
			Cw.wn("5.뒤로가기");
			Kiosk.cmd = Kiosk.sc.next();
			switch(Kiosk.cmd) {
				case "1":
					ProductsList.list();
					break;
				case "2":
					ProductsList.edit();
					break;
				case "3":
					ProductsList.delete();
					break;
				case "4":
					ProductsList.add();
					break;
				case "5":
					break order;
				default:
					break;
			}			
		}
	}
}


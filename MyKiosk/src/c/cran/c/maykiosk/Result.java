package c.cran.c.maykiosk;

import com.cran.util.Cw;

public class Result {

	public static void run() {
		// TODO Auto-generated method stub
		Charge charge = new Charge();
		ResultPay resultpay = new ResultPay();
		OrderDelete orderdelete = new OrderDelete();
		XX:while(true) {
			if(Login.now.sum()==0) {
				Cw.wn("장바구니에 아무것도 없습니다.");
				break XX;
			}
			else {
				Cw.w("장바구니에는");
				for(Products a:Login.now.ordered) {
					Cw.w("|"+a.name+"|");
				}
				Cw.wn("이 있습니다.");
					Cw.w("=",30);
				Cw.wn();
				Cw.wn("총 : "+Login.now.sum()+"원 입니다.");
				Cw.wn("잔액 : "+Login.now.money+"원 입니다.");
				Cw.wn("남은 시간은 :"+Login.now.timeString()+"시간 입니다.");
				Cw.w("=",30);
				Cw.wn();
				Cw.wn("1.계산하기.");
				Cw.wn("2.장바구니에서 품목 삭제하기.");
				Cw.wn("3.잔액 충전하기");
				Cw.wn("4.뒤로가기");
				String cm = Kiosk.sc.next();
				switch(cm) {
					case "1":
						resultpay.run();
						break XX;
					case "2":
						orderdelete.run();
						break;
					case "3":
						charge.run();
						break;
					case "4":
						break XX;
					default:
						break;
				}
			}
		}
	}
}

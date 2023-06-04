package c.cran.c.maykiosk;

import com.cran.util.Cw;

public class TimeCharge {
	void run() {
		time:while(true) {
			int counts =0;
			Cw.wn("남은 시간은 :"+Login.now.timeString()+"입니다.");
			Cw.wn("충전하실 시간을 선택 해 주세요.");
			Cw.w("=",30);
			Cw.wn();
			for(Products i : ProductsList.Times) {
			Cw.wn((counts+1)+"."+i.name+": "+i.price+"원 입니다.");
			counts = counts+1;
			}
			Cw.wn((counts+1)+". 뒤로 가기");
			int cm;
			if(Kiosk.sc.hasNextInt()) {
			cm = Kiosk.sc.nextInt();
			}else {
				Cw.wn("정수를 입력 해 주세요");
				break;
			}
			if(cm==(counts+1)) {
				break;
			}else {
			Login.now.ordered.add(ProductsList.Times.get(cm-1));
			Cw.wn(ProductsList.Times.get(cm-1).name+", "+ProductsList.Times.get(cm-1).price+"원 | 선택하셨습니다.");
			Cw.w("장바구니에는");
			for(Products a:Login.now.ordered) {
				Cw.w("|"+a.name+"|");
			}
			Cw.wn("이 있습니다.");
			Cw.w("=",30);
			Cw.wn();
			Cw.wn("총 : "+Login.now.sum()+"원 입니다.");
			Cw.w("=",30);
			Cw.wn();
			Cw.wn("1. 계속 선택하기");
			Cw.wn("2. 메인 메뉴로 돌아가기");
			Cw.wn("3. 결제하기");
			Kiosk.cmd = Kiosk.sc.next();
			switch(Kiosk.cmd) {
			case"1":
				break;
			case"2":
				break time;
			case"3":
				Result.run();
				break time;
			default:
				break;
			}
			}
		}
	}
	}


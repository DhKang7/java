package c.cran.c.maykiosk;

import com.cran.util.Cw;

public class CustomMan {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("고객관리");
		X:while(true) {
			Cw.w("=",30);
			Cw.wn();
			Cw.wn("관리 명령어");
			Cw.wn("1.고객 리스트");
			Cw.wn("2.고객 정보 수정하기");
			Cw.wn("3.고객 정보 제거하기");
			Cw.wn("4.뒤로가기");
			String cm = Kiosk.sc.next();
			switch(cm) {
				case "1":
					for(Customer a:CustomerList.List) {
						Cw.wn("ID:"+a.ID+", name:"+a.Name+", time:"+a.timeString()+", money:"+a.money);
					}
					break;
				case "2":
					CustomerList.edit();
					break;
				case "3":
					CustomerList.delete();
					break;
				case "4":
					break X;
				default:
					break;
			}			
		}
	}

}

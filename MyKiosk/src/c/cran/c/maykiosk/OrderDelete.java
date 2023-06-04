package c.cran.c.maykiosk;

import java.util.ArrayList;

import com.cran.util.Cw;

public class OrderDelete {
	public void run() {
		XX:while(true) {
			int count = 0;
			if(Login.now.sum()==0) {
				break XX;
			}
			else {
			Cw.wn("장바구니에는");
			for(Products a:Login.now.ordered) {
				Cw.wn((count+1)+"."+a.name+" : "+a.price+"원|");
				count = count+1;
			}
			Cw.wn("이 있습니다.");
			Cw.wn("삭제할 항목을 선택 해 주세요. (0 : 장바구니 비우기 x : 나가기)");
			String cmd = Kiosk.sc.next();
			//int cm = Kiosk.sc.nextInt();
			try {
			int cm = Integer.parseInt(cmd);
			if(cm==0) {
			//if(cm==0) {
				Login.now.ordered=new ArrayList<Products>();
				Cw.wn("장바구니를 비웠습니다.");
				break XX;
			} 
			else if((cm-1)>Login.now.ordered.size()) {
				Cw.wn("입력된 숫자가 너무 큽니다.");
				break;
			}
			else if((cm-1)<=Login.now.ordered.size()){
				int cc=cm-1;
				Cw.wn(Login.now.ordered.get(cc).name+": "+Login.now.ordered.get(cc).price+"원 선택되었습니다. 장바구니에서 제거할까요?");
				Cw.wn("1. 제거한다.");
				Cw.wn("2. 다른 제품을 선택한다.");
				if(Kiosk.sc.hasNextInt()) {
				cm = Kiosk.sc.nextInt();
				}else {
					Cw.wn("정수 값을 입력 해 주세요");
					break;
				}
				switch(cm) {
					case 1:
						Login.now.ordered.remove(cm-1);
						break;
					case 2:
						break;
				}
			}
			}catch (NumberFormatException e){
				break XX;
			}
			}
	}
	}
}

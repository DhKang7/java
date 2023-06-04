package c.cran.c.maykiosk;

import com.cran.util.Cw;

public class Order {
	int divide;

	public void run() {
		// TODO Auto-generated method stub
			order:while(true) {
				int counts =0;
				int cm;
				Cw.wn("주문하실 상품을 선택 해 주세요");
				Cw.w("=",30);
				Cw.wn();
				for(Products i : ProductsList.Foods) {
				Cw.wn((counts+1)+"."+i.name+": "+i.price+"원 입니다.");
				counts = counts+1;
				}
				divide = counts;
				for(Products i : ProductsList.Drinks) {
					Cw.wn((counts+1)+"."+i.name+": "+i.price+"원 입니다.");
					counts = counts+1;
				}
				Cw.wn((counts+1)+". 뒤로 가기");
				if(Kiosk.sc.hasNextInt()) {
				cm = Kiosk.sc.nextInt();
				}else {
					Cw.wn("정수 값을 입력 해 주세요");
					break;
				}
				if(cm==(counts+1)) {
					break;
				}else {
					if(cm<=divide) {
				Login.now.ordered.add(ProductsList.Foods.get(cm-1));
				Cw.wn(ProductsList.Foods.get(cm-1).name+", "+ProductsList.Foods.get(cm-1).price+"원 | 선택하셨습니다.");
					}
					else if(cm>divide) {
						Login.now.ordered.add(ProductsList.Drinks.get(cm-1-divide));
						Cw.wn(ProductsList.Drinks.get(cm-1-divide).name+", "+ProductsList.Drinks.get(cm-1-divide).price+"원 | 선택하셨습니다.");
					}
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
					break order;
				case"3":
					Result.run();
					break order;
				default:
					break;
				}
				}
			}
		}
}


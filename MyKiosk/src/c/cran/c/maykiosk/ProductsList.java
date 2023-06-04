package c.cran.c.maykiosk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.cran.util.Cw;

public class ProductsList {

	static ArrayList<Products> Times = new ArrayList<Products>();
	static ArrayList<Products> Foods = new ArrayList<Products>();
	static ArrayList<Products> Drinks = new ArrayList<Products>();
	public static void run() {
		// TODO Auto-generated method stub
		Times.add(new Products("1시간", 1000, true, 1));
		Times.add(new Products("3시간", 2500, true, 3));
		Times.add(new Products("7시간", 5000, true, 7));
		Times.add(new Products("16시간", 10000, true, 16));
		Times.add(new Products("36시간", 20000, true, 36));
		Times.add(new Products("100시간", 50000, true, 100));
		
		Foods.add(new Products("왕뚜껑",1000));
		Foods.add(new Products("짜빠구리",2000));
		Foods.add(new Products("핫도그",3500));
		Foods.add(new Products("햄버거",4500));
		Foods.add(new Products("김치볶음밥",6000));
		Foods.add(new Products("피자",9000));
		
		Drinks.add(new Products("생수",500));
		Drinks.add(new Products("아이스 아메리카노",1500));
		Drinks.add(new Products("콜라",2000));
		Drinks.add(new Products("생과일쥬스",3500));
		Drinks.add(new Products("맥주",4500));
	}
	public static void list() {
		Cw.wn(">>>>제품 리스트<<<<");
		Cw.w("=",30);
		Cw.wn();
		Cw.wn("[[[[[시간 요금제]]]]]");
		for(Products i : ProductsList.Times) {
		Cw.wn(i.name+": "+i.price+"원");
		}
		Cw.wn("[[[[[식사류]]]]]");
		for(Products i : ProductsList.Foods) {
			Cw.wn(i.name+": "+i.price+"원");
		}
		Cw.wn("[[[[[음료]]]]]");
		for(Products i : ProductsList.Drinks) {
			Cw.wn(i.name+": "+i.price+"원");
		}
	}
	public static void delete() {
		// TODO Auto-generated method stub
		X:while(true) {
		Cw.wn("제거할 상품의 종류를 입력 해 주세요");
		Cw.wn("1.요금제");
		Cw.wn("2.음식류");
		Cw.wn("3.음료");
		Cw.wn("4.뒤로가기");
		String cmm = Kiosk.sc.next();
		switch(cmm) {
		case "1":
			int count = 0;
			int cm;
			for(Products i:Times) {
				Cw.wn((count+1)+"."+i.name);
			}
			Cw.wn("제거할 상품의 번호를 입력 해 주세요");
			if(Kiosk.sc.hasNextInt()) {
			cm = Kiosk.sc.nextInt();
			}else {
				Cw.wn("정수 값을 입력 해 주세요.");
				break;
			}
			Cw.wn(Times.get(cm-1).name+"을 선택하셨습니다. 제거하십니까?");
			Cw.wn("1.네");
			Cw.wn("2.아니요");
			String c = Kiosk.sc.next();
			switch(c) {
			case "1":
				Times.remove(cm-1);
				Cw.wn("제거되었습니다.");
				break X;
			case "2":
				Cw.wn("취소되었습니다.");
				break;
			default:
				break;
			}
			break;
		case "2":
			count = 0;
			for(Products i:Foods) {
				Cw.wn((count+1)+"."+i.name);
			}
			Cw.wn("제거할 상품의 번호를 입력 해 주세요");
			if(Kiosk.sc.hasNextInt()) {
			cm = Kiosk.sc.nextInt();
			}else {
				Cw.wn("정수 값을 입력 해 주세요.");
				break;
			}
			Cw.wn(Foods.get(cm-1).name+"을 선택하셨습니다. 제거하십니까?");
			Cw.wn("1.네");
			Cw.wn("2.아니요");
			c = Kiosk.sc.next();
			switch(c) {
			case "1":
				Foods.remove(cm-1);
				Cw.wn("제거되었습니다.");
				break X;
			case "2":
				Cw.wn("취소되었습니다.");
				break;
			default:
				break;
			}
			break;
		case "3":
			count = 0;
			for(Products i:Drinks) {
				Cw.wn((count+1)+"."+i.name);
			}
			Cw.wn("제거할 상품의 번호를 입력 해 주세요");
			if(Kiosk.sc.hasNextInt()) {
			cm = Kiosk.sc.nextInt();
			}else {
				Cw.wn("정수 값을 입력 해 주세요");
				break;
			}
			Cw.wn(Drinks.get(cm-1).name+"을 선택하셨습니다. 제거하십니까?");
			Cw.wn("1.네");
			Cw.wn("2.아니요");
			c = Kiosk.sc.next();
			switch(c) {
			case "1":
				Drinks.remove(cm-1);
				Cw.wn("제거되었습니다.");
				break X;
			case "2":
				Cw.wn("취소되었습니다.");
				break;
			default:
				break;
			}
			break;
		case "4":
			break X;
		default:
			break;
		}
	}
}
	public static void edit() {
		// TODO Auto-generated method stub
		X:while(true) {
			Cw.wn("수정할 상품의 종류를 입력 해 주세요");
			Cw.wn("1.요금제");
			Cw.wn("2.음식류");
			Cw.wn("3.음료");
			Cw.wn("4.뒤로가기");
			String cmm = Kiosk.sc.next();
			switch(cmm) {
			case "1":
				int count = 0;
				int cm;
				for(Products i:Times) {
					Cw.wn((count+1)+"."+i.name);
				}
				Cw.wn("수정할 상품의 번호를 입력 해 주세요");
				if(Kiosk.sc.hasNextInt()) {
				cm = Kiosk.sc.nextInt();
				}else {
					Cw.wn("정수 값을 입력 해 주세요.");
					break;
				}
				Cw.wn(Times.get(cm-1).name+"을 선택하셨습니다. 수정 하십니까?");
				Cw.wn("1.네");
				Cw.wn("2.아니요");
				String c = Kiosk.sc.next();
				switch(c) {
				case "1":
					Cw.wn("몇 시간으로 수정하시겠습니까?");
					int cs;
					int cmmm;
					if(Kiosk.sc.hasNextInt()) {
					cs= Kiosk.sc.nextInt();
					}else {
						Cw.wn("정수 값을 입력 해 주세요");
						break;
					}
					Times.get(cm-1).time = cs;
					Times.get(cm-1).name = (cs+"시간");
					Cw.wn("수정할 가격을 입력 해 주세요");
					if(Kiosk.sc.hasNextInt()) {
					cmmm = Kiosk.sc.nextInt();
					}else {
						Cw.wn("정수 값을 입력 해 주세요");
						break;
					}
					Times.get(cm-1).price=cmmm;
					Cw.wn(Times.get(cm-1).name+", "+Times.get(cm-1).price+"원으로 수정되었습니다.");
					Collections.sort(Times, Comparator.comparingInt(Products::getTime));
					break X;
				case "2":
					Cw.wn("취소되었습니다.");
					break;
				default:
					break;
				}
				break;
			case "2":
				count = 0;
				for(Products i:Foods) {
					Cw.wn((count+1)+"."+i.name);
				}
				Cw.wn("수정할 상품의 번호를 입력 해 주세요");
				if(Kiosk.sc.hasNextInt()) {
				cm = Kiosk.sc.nextInt();
				} else {
					Cw.wn("정수 값을 입력 해 주세요.");
					break;
				}
				Cw.wn(Foods.get(cm-1).name+"을 선택하셨습니다. 수정 하십니까?");
				Cw.wn("1.네");
				Cw.wn("2.아니요");
				String cl = Kiosk.sc.next();
				switch(cl) {
				case "1":
					Cw.wn("수정할 이름을 입력 해 주세요");
					int cmmm;
					String cs = Kiosk.sc.next();
					Foods.get(cm-1).name = cs;
					Cw.wn("수정할 가격을 입력 해 주세요");
					if(Kiosk.sc.hasNextInt()) {
					cmmm = Kiosk.sc.nextInt();
					}else {
						Cw.wn("정수 값을 입력 해 주세요.");
						break;
					}
					Foods.get(cm-1).price=cmmm;
					Cw.wn(Foods.get(cm-1).name+", "+Foods.get(cm-1).price+"원으로 수정되었습니다.");
					break X;
				case "2":
					Cw.wn("취소되었습니다.");
					break;
				default:
					break;
				}
				break;
			case "3":
				count = 0;
				for(Products i:Drinks) {
					Cw.wn((count+1)+"."+i.name);
				}
				Cw.wn("수정할 상품의 번호를 입력 해 주세요");
				if(Kiosk.sc.hasNextInt()) {
				cm = Kiosk.sc.nextInt();
				}else {
					Cw.wn("정수 값을 입력 해 주세요.");
					break;
				}
				Cw.wn(Drinks.get(cm-1).name+"을 선택하셨습니다. 수정 하십니까?");
				Cw.wn("1.네");
				Cw.wn("2.아니요");
				c = Kiosk.sc.next();
				switch(c) {
				case "1":
					Cw.wn("수정할 이름을 입력 해 주세요");
					int cmmm;
					String cs = Kiosk.sc.next();
					Drinks.get(cm-1).name = cs;
					Cw.wn("수정할 가격을 입력 해 주세요");
					if(Kiosk.sc.hasNextInt()) {
					cmmm = Kiosk.sc.nextInt();
					} else {
						Cw.wn("정수 값을 입력 해 주세요.");
						break;
					}
					Drinks.get(cm-1).price=cmmm;
					Cw.wn(Drinks.get(cm-1).name+", "+Drinks.get(cm-1).price+"원으로 수정되었습니다.");
					break X;
				case "2":
					Cw.wn("취소되었습니다.");
					break;
				default:
					break;
				}
				break;
			case "4":
				break X;
			default:
				break;
			}
		}
		
	}
	public static void add() {
		// TODO Auto-generated method stub
		X:while(true) {
			Cw.wn("수정할 상품의 종류를 입력 해 주세요");
			Cw.wn("1.요금제");
			Cw.wn("2.음식류");
			Cw.wn("3.음료");
			Cw.wn("4.뒤로가기");
			Kiosk.cmd = Kiosk.sc.next();
			switch(Kiosk.cmd) {
			case "1":
				Cw.wn("추가할 상품의 시간을 입력 해 주세요.");
				int c;
				int b;
				if(Kiosk.sc.hasNextInt()) {
				c = Kiosk.sc.nextInt();
				}else {
					Cw.wn("정수 값을 입력 해 주세요.");
					break;
				}
				Cw.wn("추가할 상품의 가격을 입력 해 주세요.");
				if(Kiosk.sc.hasNextInt()) {
				b = Kiosk.sc.nextInt();
				}else {
					Cw.wn("정수 값을 입력 해 주세요.");
					break;
				}
				Products a = new Products(c+"시간",b,true,c);
				Times.add(a);
				Collections.sort(Times, Comparator.comparingInt(Products::getTime));
				break X;
			case "2":
				Cw.wn("추가할 상품의 이름을 입력 해 주세요.");
				String nn = Kiosk.sc.next();
				Cw.wn("추가할 상품의 가격을 입력 해 주세요.");
				if(Kiosk.sc.hasNextInt()) {
				b = Kiosk.sc.nextInt();
				}else {
					Cw.wn("정수 값을 입력 해 주세요.");
					break;
				}
				Foods.add(new Products(nn,b));
				break X;
			case "3":
				Cw.wn("추가할 상품의 이름을 입력 해 주세요.");
				nn = Kiosk.sc.next();
				Cw.wn("추가할 상품의 가격을 입력 해 주세요.");
				if(Kiosk.sc.hasNextInt()) {
				b = Kiosk.sc.nextInt();
				}else {
					Cw.wn("정수 값을 입력 해 주세요.");
					break;
				}
				Drinks.add(new Products(nn,b));
				break X;
			case "4":
				break X;
			default:
				break;
			}
		}
	}
}

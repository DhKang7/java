package c.cran.c.maykiosk;

import com.cran.util.Cw;

public class Charge {
	//String formatcharge = String.format("남은 잔액은 %d, 입니다.", Login.now.money);
	public void run() {
		// TODO Auto-generated method stub
		//현재 잔액 보여주기, 충전할 금액 선택하기, 현금/카드 선택, 거스름 계산
		//충전 후 잔액 보여주면서 종료
		XX:while(true) {
			int wantcharge = 0;
			Cw.wn("남은 잔액 : " +Login.now.money);
			Cw.w("=",30);
			Cw.wn();
			Cw.wn("1. 잔액 충전하기");
			Cw.wn("2. 이전 메뉴로 돌아가기");
			String cm = Kiosk.sc.next();
			YY:switch(cm) {
				case "1":
					Cw.wn("충전하실 금액을 입력 해 주세요");
					if(Kiosk.sc.hasNextInt()) {
					wantcharge = Kiosk.sc.nextInt();
					}else {
						Cw.wn("정수 값을 입력 해 주세요");
						break;
					}
					Cw.wn(wantcharge +"원 입력하셨습니다.");
					Cw.wn("결제 방법을 선택 해 주세요");
					Cw.wn("1.카드 결제");
					Cw.wn("2.현금 결제");
					Cw.wn("3.취소하기");
					String cmm = Kiosk.sc.next();
					switch(cmm) {
					case "1":
						Cw.wn("카드를 리더기에 넣어주세요.");
						Login.now.money=Login.now.money+wantcharge;
						Cw.wn("감사합니다. "+wantcharge+"원 충전이 완료되었습니다. 남은 잔액 : " +Login.now.money+"원");
						wantcharge = 0;
						break XX;
					case "2":
						Cw.wn("현금을 투입 해 주세요.");
						int insert=0;
						while(true) {
							if(wantcharge>insert) {
								Cw.wn("1.100원 투입");
								Cw.wn("2.500원 투입");
								Cw.wn("3.1000원 투입");
								Cw.wn("4.5000원 투입");
								Cw.wn("5.10000원 투입");
								Cw.wn("6.50000원 투입");
								Cw.wn("7.취소하기");
								String cmmm = Kiosk.sc.next();
								switch(cmmm) {
								case "1":
									insert=insert+100;
									if(wantcharge>insert) {
										Cw.wn("투입현금 :"+insert+", "+(wantcharge-insert)+"원 더 투입해주세요.");
										}
										else {
											Cw.wn("투입현금 :"+insert);
										}
									break;
								case "2":
									insert=insert+500;
									if(wantcharge>insert) {
										Cw.wn("투입현금 :"+insert+", "+(wantcharge-insert)+"원 더 투입해주세요.");
										}
										else {
											Cw.wn("투입현금 :"+insert);
										}
									break;
								case "3":
									insert=insert+1000;
									if(wantcharge>insert) {
										Cw.wn("투입현금 :"+insert+", "+(wantcharge-insert)+"원 더 투입해주세요.");
										}
										else {
											Cw.wn("투입현금 :"+insert);
										}
									break;
								case "4":
									insert=insert+5000;
									if(wantcharge>insert) {
										Cw.wn("투입현금 :"+insert+", "+(wantcharge-insert)+"원 더 투입해주세요.");
										}
										else {
											Cw.wn("투입현금 :"+insert);
										}
									break;
								case "5":
									insert=insert+10000;
									if(wantcharge>insert) {
										Cw.wn("투입현금 :"+insert+", "+(wantcharge-insert)+"원 더 투입해주세요.");
										}
										else {
											Cw.wn("투입현금 :"+insert);
										}
									break;
								case "6":
									insert=insert+50000;
									if(wantcharge>insert) {
										Cw.wn("투입현금 :"+insert+", "+(wantcharge-insert)+"원 더 투입해주세요.");
										}
										else {
											Cw.wn("투입현금 :"+insert);
										}
									break;
								case "7":
									Cw.wn("현금 충전을 취소합니다. 투입했던 현금을 받아가세요. 투입금:"+insert+"원");
									insert=0;
									break YY;
									
								default:
									break;
								}
								
							}
							else if(wantcharge == insert) {
								Login.now.money=Login.now.money+wantcharge;
								Cw.wn("감사합니다. "+wantcharge+"원 충전이 완료되었습니다. 남은 잔액 : " +Login.now.money+"원");
								wantcharge = 0;
								break XX;
							}
							else if(wantcharge < insert) {
								Login.now.money=Login.now.money+wantcharge;
								Cw.wn("감사합니다. "+wantcharge+"원 충전이 완료되었습니다. 남은 잔액 : " +Login.now.money+"원");
								Cw.wn("거스름돈 "+(insert-wantcharge)+"원 반환합니다.");
								wantcharge = 0;
								break XX;
								
							}
						}
					case "3":
						break;
					default:
						break;
					}
					break;
				case "2":
					break XX;
				default:
					break;
			}
		}
			
	}
}



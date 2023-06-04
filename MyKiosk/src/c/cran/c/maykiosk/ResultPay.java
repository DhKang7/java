package c.cran.c.maykiosk;

import java.util.ArrayList;

import com.cran.util.Cw;

public class ResultPay {
	public void run() {
		XX:while(true) {
			if(Login.now.sum()==0) {
				Cw.wn("장바구니에 아무것도 없습니다.");
				break;
			}
			else {
				Cw.wn("1.잔액으로 계산하기.");
				Cw.wn("2.카드로 계산하기.");
				Cw.wn("3.현금으로 계산하기.");
				Cw.wn("4.뒤로가기.");
				String cmm =Kiosk.sc.next();
				switch(cmm) {
					case "1":
						if(Login.now.money>=Login.now.sum()) {
							Login.now.money = Login.now.money-Login.now.sum();
							for(Products a:Login.now.ordered) {
								if(a.istime) {
									Login.now.timeRemain=Login.now.timeRemain+a.time;
								}
							}
							Login.now.ordered=new ArrayList<Products>();
							Cw.wn("결제가 완료되었습니다. 잔액 :"+Login.now.money);
							Cw.wn("남은 시간은 :"+Login.now.timeString()+"입니다.");
							break XX;				
						}
						else if(Login.now.money<Login.now.sum()) {
							Cw.wn("잔액이 부족합니다. 잔액 :"+Login.now.money+", 결제금액 : "+Login.now.sum());
							break;
						}
					case "2":
						Cw.wn("카드를 투입 해주십시오.");
						Cw.wn("결제가 완료되었습니다.");
						for(Products a:Login.now.ordered) {
							if(a.istime) {
								Login.now.timeRemain=Login.now.timeRemain+a.time;
							}
						}
						Cw.wn("남은 시간은 :"+Login.now.timeString()+"입니다.");
						Login.now.ordered=new ArrayList<Products>();
						break XX;
					case "3":
						Cw.wn("현금을 투입 해 주세요.");
						int insert=0;
						while(true) {
							if(Login.now.sum()>insert) {
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
										Cw.wn("투입현금 :"+insert+", "+(Login.now.sum()-insert)+"원 더 투입해주세요.");
										break;
									case "2":
										insert=insert+500;
										Cw.wn("투입현금 :"+insert+", "+(Login.now.sum()-insert)+"원 더 투입해주세요.");
										break;
									case "3":
										insert=insert+1000;
										Cw.wn("투입현금 :"+insert+", "+(Login.now.sum()-insert)+"원 더 투입해주세요.");
										break;
									case "4":
										insert=insert+5000;
										Cw.wn("투입현금 :"+insert+", "+(Login.now.sum()-insert)+"원 더 투입해주세요.");
										break;
									case "5":
										insert=insert+10000;
										Cw.wn("투입현금 :"+insert+", "+(Login.now.sum()-insert)+"원 더 투입해주세요.");
										break;
									case "6":
										insert=insert+50000;
										Cw.wn("투입현금 :"+insert+", "+(Login.now.sum()-insert)+"원 더 투입해주세요.");
										break;
									case "7":
										Cw.wn("현금 충전을 취소합니다. 투입했던 현금을 받아가세요. 투입금:"+insert+"원");
										insert=0;
										break XX;
										
									default:
										break;
								}
								
							}
							else if(Login.now.sum() == insert) {
								for(Products a:Login.now.ordered) {
									if(a.istime) {
										Login.now.timeRemain=Login.now.timeRemain+a.time;
									}
								}
								Login.now.ordered=new ArrayList<Products>();
								Cw.wn("결제가 완료되었습니다. 잔액 :"+Login.now.money);
								Cw.wn("남은 시간은 :"+Login.now.timeString()+"입니다.");
								break XX;				
							}
							else if(Login.now.sum() < insert) {
								int cha = insert - Login.now.sum();
								for(Products a:Login.now.ordered) {
									if(a.istime) {
										Login.now.timeRemain=Login.now.timeRemain+a.time;
									}
								}
								Login.now.ordered=new ArrayList<Products>();
								Cw.wn("결제가 완료되었습니다. 잔액 :"+Login.now.money);
								Cw.wn("남은 시간은 :"+Login.now.timeString()+"입니다.");
								Cw.wn("거스름돈 "+cha+"원 반환합니다.");
								break XX;				
								
							}
						}
					case "4":
						break XX;
					default:
						break;
				}
			}
		}
	}
}

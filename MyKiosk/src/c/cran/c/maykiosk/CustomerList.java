package c.cran.c.maykiosk;

import java.util.ArrayList;

import com.cran.util.Cw;

public class CustomerList {
	static ArrayList<Customer> List = new ArrayList<Customer>();
	static ArrayList<String> ListSt = new ArrayList<String>();
	public static void run() {
		List.add(new Customer("admin","관리자",(float) 0, 0));
		List.add(new Customer("a0001","김민지",(float) 3.5, 5000));
		List.add(new Customer("a0002","하니팜",(float) 0.0, 0));
		List.add(new Customer("a0003","다니엘마쉬",(float) 1.1, 10000));
		List.add(new Customer("a0004","강해린",(float) 3.1, 3000));
		List.add(new Customer("a0005","이혜인",(float) 11.2, 50000));
		List.add(new Customer("a0006","피터퀼",(float) 5.5, 2000));
		List.add(new Customer("a0007","가모라",(float) 0.2, 0));
		List.add(new Customer("a0008","로켓라쿤",(float) 0.9, 0));
		List.add(new Customer("a0009","그루트",(float) 22.2, 150000));
		List.add(new Customer("a0010","드랙스",(float) 31.1, 1000000));
		for(Customer a:List) {
			ListSt.add(a.ID);
		}
	}
	public static Customer find(String id) {
		Customer nC = new Customer(id);
		if(ListSt.contains(id)==true) {
			for(Customer a:List) {
				if(id.equals(a.ID)) {
					nC = a;
				}
			}
		}
		else {
			Cw.wn("처음 오셨네요. 이름이 무엇인가요?");
			Kiosk.cmd=Kiosk.sc.next();
			nC.Name=Kiosk.cmd;
			List.add(nC);
			ListSt.add(id);
		}
		return nC;
	}
	public static void edit() {
		// TODO Auto-generated method stub
		Cw.wn("수정하실 고객님의 ID를 입력 해 주세요.");
		Kiosk.cmd = Kiosk.sc.next();
		if(List.get(0).ID.equals(Kiosk.cmd)) {
			Cw.wn("관리자용 ID는 변경할 수 없습니다.");
		}
		else {
			int key = -1;
			for(int i = 0; i<List.size(); i++) {
				if(List.get(i).ID.equals(Kiosk.cmd)) {
					key = i;
				}
			}
			if(key == -1) {
				Cw.wn("ID와 일치하는 고객님을 찾을 수 없습니다.");
			}
			else {
				Cw.wn("ID:"+List.get(key).ID+", name:"+List.get(key).Name+", time:"+List.get(key).timeString()+", money:"+List.get(key).money);
				Cw.wn("수정할 이름을 입력 해 주세요.");
				Kiosk.cmd = Kiosk.sc.next();
				List.get(key).Name = Kiosk.cmd;
				Cw.wn("수정할 남은 시간을 숫자로 입력 해 주세요.");
				if(Kiosk.sc.hasNextFloat()) {
					float k = Kiosk.sc.nextFloat();
					List.get(key).timeRemain = k;
				}else {
					String wronginput = Kiosk.sc.next();
					Cw.wn("실수 숫자 값을 입력 해 주세요. 예시)2시간 반 = 2.5. 입력한 값 = "+wronginput);
				}
				Cw.wn("수정할 잔액을 입력 해 주세요.");
				if(Kiosk.sc.hasNextInt()) {
					int m = Kiosk.sc.nextInt();
					List.get(key).money = m;
				}else {
					Cw.wn("숫자로 입력 해 주세요.");
				}
				Cw.wn("ID:"+List.get(key).ID+", name:"+List.get(key).Name+", time:"+List.get(key).timeString()+", money:"+List.get(key).money);
				Cw.wn("수정되었습니다.");
			}
		}
		
	}
	public static void delete() {
		// TODO Auto-generated method stub
		Cw.wn("삭제하실 고객님의 ID를 입력 해 주세요.");
		Kiosk.cmd = Kiosk.sc.next();
		if(List.get(0).ID.equals(Kiosk.cmd)) {
			Cw.wn("관리자용 ID는 삭제할 수 없습니다.");
		}
		else {
			int key = -1;
			for(int i = 0; i<List.size(); i++) {
				if(List.get(i).ID.equals(Kiosk.cmd)) {
					key = i;
				}
			}
			if(key == -1) {
				Cw.wn("ID와 일치하는 고객님을 찾을 수 없습니다.");
			}
			else {
				Cw.wn("ID:"+List.get(key).ID+", name:"+List.get(key).Name+", time:"+List.get(key).timeString()+", money:"+List.get(key).money);
				Cw.wn("정말 삭제하시겠습니까? Y/N");
				X:while(true) {
				Kiosk.cmd = Kiosk.sc.next();
				switch(Kiosk.cmd) {
				case "Y":
					List.remove(key);
					ListSt.remove(key);
					Cw.wn("삭제되었습니다.");
					break X;
				case "N":
					Cw.wn("취소되었습니다.");
					break X;
				default:
					break;
				}
				}
			}
		}
		
	}
}

package com.cran.c.myboardsql;

import util.Cw;

public class Display {

	public static void mainpage() {
		// TODO Auto-generated method stub
		//Cw.w("🍎", 27);
		Cw.wn();
		Cw.w("🍎", 10);
		Cw.w("메인 페이지 입니다.");
		Cw.w("🍎", 10);
		Cw.wn();
		//Cw.w("🍎", 27);
		Cw.wn();
		Cw.wn("[1.글 리스트][2.글 읽기][3.글 작성][4.글 삭제][5.글 수정][0.관리자모드][x.나가기]");
	}

}

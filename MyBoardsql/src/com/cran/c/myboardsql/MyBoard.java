package com.cran.c.myboardsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyBoard {

	static Connection con = null;
	static Statement st = null;
	static ResultSet result = null;
	static Scanner sc=new Scanner(System.in);
	static String cmd;
	public void run() {
		// TODO Auto-generated method stub
		dbConnect();
		XX:while(true) {
		Display.mainpage();
		cmd = sc.next();
		switch(cmd) {
		case "1": //리스트
			BoardList.run();
			break;
		case "2": //읽기
			ReadBoard.run();
			break;
		case "3": //작성
			WriteBoard.run();
			break;
		case "4": //삭제
			DeleteBoard.run();
			break;
		case "5": //수정
			EditBoard.run();
			break;
		case "0": //관리자
			break;
		case "x": //종료
			break XX;
		default:
			break;
		}
		}
	}
	private void dbConnect() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhome", "root", "root");
			st = con.createStatement();	// Statement는 정적 SQL문을 실행하고 결과를 반환받기 위한 객체다. Statement하나당 한개의 ResultSet 객체만을 열 수있다.
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	static void dbExecuteUpdate(String query) {
		try {
			int resultCount = st.executeUpdate(query);
			System.out.println("처리된 행 수:"+resultCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

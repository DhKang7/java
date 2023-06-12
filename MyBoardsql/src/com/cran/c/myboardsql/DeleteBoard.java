package com.cran.c.myboardsql;

import java.sql.SQLException;

import util.Cw;

public class DeleteBoard {

	public static void run() {
		// TODO Auto-generated method stub
		System.out.println("삭제할 글번호를 입력해주세요:");
		String delNo = MyBoard.sc.next();
		String query = "update myboard set t_now=now()where t_no="+delNo;
		try {
			int resultCount = MyBoard.st.executeUpdate(query);
			if(resultCount == 0) {
				Cw.wn("글이 존재하지 않습니다.");
			}
			else {
		MyBoard.dbExecuteUpdate("delete from myboard where t_no="+delNo);
			}
		} catch (SQLException e) {
		e.printStackTrace();
		}
	

	}
}

package com.cran.c.myboardsql;

import java.sql.SQLException;

import util.Cw;

public class ReadBoard {

	public static void run() {
		// TODO Auto-generated method stub
		Cw.wn("읽을 글 번호를 입력해주세요:");
		String readNo = MyBoard.sc.next();
		String query = "update myboard set t_now=now()where t_no="+readNo;
		try {
			int resultCount = MyBoard.st.executeUpdate(query);
			if(resultCount == 0) {
				Cw.wn("글이 존재하지 않습니다.");
			}
			else {
				try {
					MyBoard.dbExecuteUpdate("update myboard set t_hit = t_hit+1 where t_no ="+readNo);
					MyBoard.result = MyBoard.st.executeQuery("select * from myboard where t_no ="+readNo);
					MyBoard.result.next();
					String title = MyBoard.result.getString("t_title");	
					String id = MyBoard.result.getString("t_id");
					int hit = MyBoard.result.getInt("t_hit");
					String content = MyBoard.result.getString("t_context");
					Cw.wn("글제목: "+title);
					Cw.wn("작성자: "+id);
					Cw.wn("조회수: "+hit);
					Cw.wn("글내용: "+content);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
}

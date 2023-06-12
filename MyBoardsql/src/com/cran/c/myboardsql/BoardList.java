package com.cran.c.myboardsql;

import java.sql.SQLException;

public class BoardList {

	public static void run() {
		// TODO Auto-generated method stub
		//System.out.println("==========================================");
		System.out.println("================= 글리스트 ==================");
		//System.out.println("==========================================");
		System.out.println("글번호 글제목 작성자id 작성시간");
		try {
			MyBoard.result = MyBoard.st.executeQuery("select * from myboard");
			while(MyBoard.result.next()) {	//한 칼럼씩 읽기. 다음이 없으면 false
				String no = MyBoard.result.getString("t_no");
				String id = MyBoard.result.getString("t_id");
				String title = MyBoard.result.getString("t_title");
				String datetime = MyBoard.result.getString("t_now");
				System.out.println(no+" "+title+" "+id+" "+datetime);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

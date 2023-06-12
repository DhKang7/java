package com.cran.c.myboardsql;

import java.sql.SQLException;

import util.Cw;

public class WriteBoard {

	public static void run() {
		// TODO Auto-generated method stub
		MyBoard.sc.nextLine();	
		//next() 사용하고 뒤에 nextLine쓰려면 추가. \n이 버퍼에 남아있기 때문. (MyBoard에서 next()사용하고 뒤에 여기로 넘어오기 때문)
		Cw.wn("작성자id를 입력해주세요:");
		String id = MyBoard.sc.nextLine();
		Cw.wn("제목을 입력해주세요:");
		String title = MyBoard.sc.nextLine();
		Cw.wn("글내용을 입력해주세요:");
		String content = MyBoard.sc.nextLine();
		try {
			MyBoard.st.executeUpdate("insert into myboard (t_title,t_id,t_now,t_context,t_hit)"
					+" values ('"+title+"','"+id+"',now(),'"+content+"',0)");
			System.out.println("글등록 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}

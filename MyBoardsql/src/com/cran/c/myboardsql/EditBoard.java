package com.cran.c.myboardsql;

import java.sql.SQLException;

import util.Cw;

public class EditBoard {

	public static void run() {
		// TODO Auto-generated method stub
		System.out.println("수정할 글번호를 입력해주세요:");
		String editNo = MyBoard.sc.next();
		String query = "update myboard set t_now=now()where t_no="+editNo;
		try {
			int resultCount = MyBoard.st.executeUpdate(query);
			if(resultCount == 0) {
				Cw.wn("글이 존재하지 않습니다.");
			}
			else {
				System.out.println("처리된 행 수:"+resultCount);
				System.out.println("제목을 입력해주세요:");
				MyBoard.sc.nextLine(); //next() 사용하고 뒤에 nextLine쓰려면 추가. \n이 버퍼에 남아있기 때문.
				String edTitle = MyBoard.sc.nextLine();
				System.out.println("작성자id를 입력해주세요:");
				String edId = MyBoard.sc.next();				
				System.out.println("글내용을 입력해주세요:");
				MyBoard.sc.nextLine();
				String edContent = MyBoard.sc.nextLine();
				
				MyBoard.dbExecuteUpdate("update myboard set t_title='"+edTitle+"',t_id='"+edId+"',t_now=now(),t_context='"+edContent+"' where t_no="+editNo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

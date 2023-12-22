package test;

import java.sql.*;

import common.JDBCUtil;

public class DB_testTbl_Insert_Test {
	public static void main(String[] args) {
		
		String sql = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		
		conn = JDBCUtil.getConnection();
		
		sql = "insert into testTbl(id, name, email) ";
		sql += "values ( nvl(((select Max(id) from testTbl) +1),1) , ";
		sql += " ?, ?)";
		
		// 자바에서는 pstmt 에서는 예외 처리가 필요함.
		try {
		// pstmt 활성화 
			pstmt = conn.prepareStatement(sql);
			
			// pstmt 의 ? 에 변수 값 할당.
			for(int i=0; i< 1000; i++) {
				pstmt.setString(1, "이상혁 - " + i);
				pstmt.setString(2, "T1@T1.com - " + i);
				
				pstmt.executeUpdate();
			}
			
			System.out.println("DB에 1000개의 레코드가 잘 저장되었습니다.");
			
		}catch (Exception e) {
			// catch 블락은 try{}에 오류가 있을때만 작동
			System.out.println("저장 중 오류가 발생되었습니다.");
			e.printStackTrace();
		} // finally {
//			// 사용한 객체 제거, finally 블락은 try{} 에서 오류가 없어도 작동, 오류가 발생해도 작동
//			// 사용한 객체 반납을 주로 사용한다.
//			
//			try {
//				conn.close();      // try catch 블락을 사용하지 않으면 오류 발생하니 주의!!
//				stmt.close();
//				pstmt.close();
//			}catch (Exception e) {
//				
//			}              //JDBCUtil.java에 객체 반납 메소드를 사용하면 밑에 finally는 안써도 된다.
//		}
		
		JDBCUtil.close(pstmt, conn);
	}
	

}

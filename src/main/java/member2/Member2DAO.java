package member2;

import java.sql.*;

import common.JDBCUtil;

public class Member2DAO {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private final String MEMBER2_INSERT =
			"insert into member2 (name, id, pass1, pass2, profile)"
			+ "values (?,?,?,?,?)";
	
	private void insertMember2 (Member2DTO dto) {
		System.out.println("insertMember2 기능 처리 =");
		
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(MEMBER2_INSERT);
			
//			pstmt.setString(1, );
					
			
		}catch (Exception e) {
			
		}finally {
			
		}
		
	}
}

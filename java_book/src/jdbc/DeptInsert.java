package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 사원 조회 (Oracle 연동)  -- PreparedStatement
 * @author USER
 *
 */
public class DeptInsert {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1. 드라이버 로딩 (메모리 로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. Connection 객체 생성
			String id="insa";
			String pw="insa";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, id, pw);
			
			//3. Statement 객체 생성
			String sql = " insert into dept (deptno, dname, loc)"
					   + " values ( ?, ?, ? ) ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//4. query 수행
			pstmt.setString(1, "80");			
			pstmt.setString(2, "개발");			
			pstmt.setString(3, "경북");			
			
			pstmt.executeUpdate();     
			
			//6. 연결 해제
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

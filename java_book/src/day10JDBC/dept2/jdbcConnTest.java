package day10JDBC.dept2;

import java.sql.*;

public class jdbcConnTest {

	public static void main(String[] args) {
		// 변수 선언
		Connection conn = null;
		Statement stmt = null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			//2. DB 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"hr","hr");
			System.out.println(conn == null ? "연결 에러" : "연결성공");			
			//3. Statement 생성
			stmt = conn.createStatement();			
			//4. sql 실행
			String sql = "insert into employees (employee_id, first_name, last_name, email, hire_date, job_id )" + 
					"               values (301, '문덕', '을지', 'chichi2@naver.com', '2000/12/1','IT_PROG' )";
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건이 등록 완료");			
		} catch ( Exception e) {
			e.printStackTrace();
		} finally {			
			try {
				//5. 연결종료
				conn.close();
			} catch (SQLException e) {				
				e.printStackTrace();			
			}
		}		
	}  // end of main
} // end of class

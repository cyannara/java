package jdbc;

import java.sql.*;

public class DBConnectionTest {

	public static void main(String[] args) {
		// Oracle 연결정보
		String jdbc_driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn =  null;
		try {
			//1. 드라이버 로딩
			Class.forName(jdbc_driver);
			//2. DB 연결
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
			System.out.println("연결성공");
			//3. SQL 구문 실행
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from departments");
			//4. 결과 처리
			while(rs.next()) {
				System.out.print(rs.getString("department_id") + "\t");
				System.out.print(rs.getString("department_name") + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close();//5. 연결해제
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

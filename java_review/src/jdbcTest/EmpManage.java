package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 사원 조회 (Oracle 연동)
 * @author USER
 *
 */
public class EmpManage {

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
			stmt = conn.createStatement();
			
			String dname = "회계";
			//4. query 수행
			String sql = " select deptno, dname, loc"
						+ "  from dept "
						+ " where dname = '" + dname +"'";
			rs = stmt.executeQuery(sql);
			
			//5. resultSet 처리
			if(rs.next()) {
				System.out.println(rs.getString("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
				System.out.println("=======");
			}
			
			//6. 연결 해제
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

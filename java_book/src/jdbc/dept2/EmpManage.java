package jdbc.dept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * ��� ��ȸ (Oracle ����)
 * @author USER
 *
 */
public class EmpManage {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1. ����̹� �ε� (�޸� �ε�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. Connection ��ü ����
			String id="insa";
			String pw="insa";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, id, pw);
			
			//3. Statement ��ü ����
			stmt = conn.createStatement();
			
			String dname = "ȸ��";
			//4. query ����
			String sql = " select deptno, dname, loc"
						+ "  from dept "
						+ " where dname = '" + dname +"'";
			rs = stmt.executeQuery(sql);
			
			//5. resultSet ó��
			if(rs.next()) {
				System.out.println(rs.getString("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
				System.out.println("=======");
			}
			
			//6. ���� ����
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

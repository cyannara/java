package day10JDBC.dept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * ��� ��ȸ (Oracle ����)  -- PreparedStatement
 * @author USER
 *
 */
public class EmpManage2 {

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
			String sql = " select deptno, dname, loc"
					+ "  from dept "
					+ " where dname = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			String dname = "ȸ��";
			//4. query ����
			pstmt.setString(1, dname);
			rs = pstmt.executeQuery();
			
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

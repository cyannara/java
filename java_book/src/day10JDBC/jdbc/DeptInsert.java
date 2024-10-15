package day10JDBC.jdbc;

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
public class DeptInsert {

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
			String sql = " insert into dept (deptno, dname, loc)"
					   + " values ( ?, ?, ? ) ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//4. query ����
			pstmt.setString(1, "80");			
			pstmt.setString(2, "����");			
			pstmt.setString(3, "���");			
			
			pstmt.executeUpdate();     
			
			//6. ���� ����
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

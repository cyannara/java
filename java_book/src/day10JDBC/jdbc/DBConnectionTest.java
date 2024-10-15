package day10JDBC.jdbc;

import java.sql.*;

public class DBConnectionTest {

	public static void main(String[] args) {
		// Oracle ��������
		String jdbc_driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn =  null;
		try {
			//1. ����̹� �ε�
			Class.forName(jdbc_driver);
			//2. DB ����
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
			System.out.println("���Ἲ��");
			//3. SQL ���� ����
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from departments");
			//4. ��� ó��
			while(rs.next()) {
				System.out.print(rs.getString("department_id") + "\t");
				System.out.print(rs.getString("department_name") + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close();//5. ��������
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

package jdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {
	static String dbdriver = "oracle.jdbc.OracleDriver";    
	static String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "hr";
	static String passwd = "hr";
	
	// DB연결 메서드
	public static Connection connect() {
		Connection conn = null;
		try {
			Class.forName(dbdriver);
			conn =  DriverManager.getConnection (dburl, user, passwd);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return conn;
	}

	public static void disconnect(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void disconnect(PreparedStatement pstmt, Connection conn) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

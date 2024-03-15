package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {

	// Oracle 연결정보
	String jdbc_driver = "oracle.jdbc.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	// 싱글톤 구현
	static DeptDAO instance;

	public static DeptDAO getInstance() {
		if (instance == null)
			instance = new DeptDAO();
		return instance;
	}

	public void connect() {
		try {
			// 1. 드라이버 로딩 : 메모리로
			Class.forName(jdbc_driver);
			// 2. DB 연결
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		// 5. 연결해제
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 전체조회
	public List<Dept> selectAll() {
		List<Dept>  list = new ArrayList<Dept>(); 
		try {
			connect();
			// sql 실행
			// 3. SQL 구문 실행
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from departments");
			// 4. 결과 처리
			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDepartment_id(rs.getString("department_id"));
				dept.setDepartment_name(rs.getString("department_name"));
				dept.setLocation_id("location_id");
				dept.setManager_id("manager_id");
				list.add(dept);
			}
			disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 단건조회
	public void selectOne(String deptId) {
		try {
			connect();
			// sql 실행
			// 3. SQL 구문 실행
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from departments where department_id=" + deptId);
			// 4. 결과 처리
			if (rs.next()) {
				System.out.print(rs.getString("department_id") + "\t");
				System.out.print(rs.getString("department_name") + "\n");
			}
			disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 등록
	public void insert(String id, String name) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "insert into departments (department_id, department_name) " + " values (" + id + " ,'" + name
					+ "')";
			int result = stmt.executeUpdate(sql);
			if (result == 0) {
				throw new Exception("등록오류");
			}
			disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 삭제

	// 수정
	public void update(Dept dept) {
		try {
			connect();
			String sql = "update departments " + " set  department_name=?, " + "  location_id=?,  "
					+ "  manager_id=?    " + " where department_id=? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDepartment_name());
			pstmt.setString(2, dept.getLocation_id());
			pstmt.setString(3, dept.getManager_id());
			pstmt.setString(4, dept.getDepartment_id());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public static void main(String[] args) {
		DeptDAO dao = DeptDAO.getInstance();
		//DeptDAO.getInstance().selectAll();
		// dao.insert("300", "인사");
		//dao.selectOne("300");
		List<Dept> datas = dao.selectAll();
		System.out.print(datas);

	}
}

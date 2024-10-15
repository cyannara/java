package day10JDBC.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {

	// Oracle ��������
	String jdbc_driver = "oracle.jdbc.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	// �̱��� ����
	static DeptDAO instance;

	public static DeptDAO getInstance() {
		if (instance == null)
			instance = new DeptDAO();
		return instance;
	}

	public void connect() {
		try {
			// 1. ����̹� �ε� : �޸𸮷�
			Class.forName(jdbc_driver);
			// 2. DB ����
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		// 5. ��������
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ��ü��ȸ
	public List<Dept> selectAll() {
		List<Dept>  list = new ArrayList<Dept>(); 
		try {
			connect();
			// sql ����
			// 3. SQL ���� ����
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from departments");
			// 4. ��� ó��
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

	// �ܰ���ȸ
	public void selectOne(String deptId) {
		try {
			connect();
			// sql ����
			// 3. SQL ���� ����
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from departments where department_id=" + deptId);
			// 4. ��� ó��
			if (rs.next()) {
				System.out.print(rs.getString("department_id") + "\t");
				System.out.print(rs.getString("department_name") + "\n");
			}
			disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ���
	public void insert(String id, String name) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "insert into departments (department_id, department_name) " + " values (" + id + " ,'" + name
					+ "')";
			int result = stmt.executeUpdate(sql);
			if (result == 0) {
				throw new Exception("��Ͽ���");
			}
			disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// ����

	// ����
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
		// dao.insert("300", "�λ�");
		//dao.selectOne("300");
		List<Dept> datas = dao.selectAll();
		System.out.print(datas);

	}
}

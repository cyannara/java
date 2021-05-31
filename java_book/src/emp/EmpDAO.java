package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import common.DAO;

public class EmpDAO extends DAO{

	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	private static EmpDAO instance = new EmpDAO();
	public static EmpDAO getInstance() {
		return instance;
	}
	
	public int insert(EmpBeans bean) {
		int r = 0;
		try{
			//1. connect
			conn = connect();
			String sql = "insert into employees(employee_id, department_id, manager_id, commission_pct, "
					+ "          salary, job_id, hire_date, phone_number, email, first_name, last_name ) "
					+ " values( (select max(employee_id)+1 from employees),"
					+ "   ?,?,?,?,?,?,?,?,?,?) ";
			//2 sql 구문 준비
			pstmt = conn.prepareStatement(sql);
			//3. sql 구문 실행
			pstmt.setString(1, bean.getDepartmentId());
			pstmt.setString(2, bean.getManagerId());
			pstmt.setString(3, bean.getCommissionPct());
			pstmt.setString(4, bean.getSalary());
			pstmt.setString(5, bean.getJobId());
			pstmt.setString(6, bean.getHireDate());
			pstmt.setString(7, bean.getPhoneNumber());
			pstmt.setString(8, bean.getEmail());
			pstmt.setString(9, bean.getFirstName());
			pstmt.setString(10, bean.getLastName());
			r = pstmt.executeUpdate();			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//4.연결해제
			disconnect(conn);  
		}	
		
		return 0;
	}

	public EmpBeans selectOne() {
		Connection conn = null;
		EmpBeans bean = null;
		try {
			// 1.드라이버 로딩	// 2.DB연결
			conn = connect();
			// 3.Statement 객체생성
			stmt = conn.createStatement();
			// 4.sql 명령 실행
			String sql = "select department_id, manager_id, commission_pct, "
					+ "          salary, job_id, hire_date, phone_number, email, first_name, last_name, employee_id "
					+ " from EMPLOYEES";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				bean = new EmpBeans();
				bean.setDepartmentId(rs.getString("department_id"));
				bean.setManagerId(rs.getString("manager_id"));
				bean.setCommissionPct(rs.getString("commission_pct"));
				bean.setSalary(rs.getString("salary"));
				bean.setHireDate(rs.getString("hire_date"));
				bean.setPhoneNumber(rs.getString("phone_number"));
				bean.setEmail(rs.getString("email"));
				bean.setFirstName(rs.getString("first_name"));
				bean.setLastName(rs.getString("last_name"));
				bean.setEmployeeId(rs.getString("employee_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bean;
	}
		

	public ArrayList<Map<String, Object>> selectAll() {
		Connection conn = null;
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		HashMap<String, Object> map = null;
		try {
			// 1.드라이버 로딩	// 2.DB연결
			conn = connect();
			// 3.Statement 객체생성
			stmt = conn.createStatement();
			// 4.sql 명령 실행
			String sql = "select department_id, manager_id, commission_pct, "
					+ "          salary, job_id, hire_date, phone_number, email, first_name, last_name, employee_id "
					+ " from EMPLOYEES";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				map = new HashMap<String, Object>();
				map.put("departmentId",rs.getString("department_id"));
				map.put("managerId",rs.getString("manager_id"));
				map.put("commissionPct",rs.getString("commission_pct"));
				map.put("salary",rs.getString("salary"));
				map.put("hireDate",rs.getString("hire_date"));
				map.put("phoneNumber",rs.getString("phone_number"));
				map.put("email",rs.getString("email"));
				map.put("lastName",rs.getString("last_name"));
				map.put("firstName",rs.getString("first_name"));
				map.put("employeeId",rs.getString("employee_id"));
				list.add(map);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}


	public ArrayList<EmpBeans> selectPage(int start, int end) {
		Connection conn = null;
		ArrayList<EmpBeans> list = new ArrayList<EmpBeans>();
		EmpBeans bean = null;
		try {
			// 1.드라이버 로딩	// 2.DB연결
			conn = connect();
			// 4.sql 명령 실행
			String sql = "select * from ( select rownum rnum, a.* from ( "
					+ " select first_name, last_name, email, hire_date, department_id from EMPLOYEES "
					+ " ) a ) b where rnum >= ? and rnum <= ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				bean = new EmpBeans();
				bean.setFirstName(rs.getString("first_name"));
				bean.setLastName(rs.getString("last_name"));
				bean.setEmail(rs.getString("email"));
				bean.setHireDate(rs.getString("hire_date"));
				bean.setDepartmentId(rs.getString("department_id"));
				list.add(bean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
}

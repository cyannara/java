package day10JDBC.dept2;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import jdbc.common.ConnectionManager;

/**
 * File : EmpDAO.java
 * Desc : 사원관리 DAO 클래스
 * @author 김유미
 */
public class EmployeesDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//싱글톤 구현
	private static EmployeesDAO instance = new EmployeesDAO();
	public static EmployeesDAO getInstance() {
		return instance;
	}
	
	public int insertEmp(Employee bean) {
		int r = 0;
		try{
			//1. connect
			conn = ConnectionManager.getConnect();
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
			ConnectionManager.disconnect(conn); 
		}	
		
		return 0;
	}

	// 신규 사원 추가 메서드
	public boolean insertDB(Employee emp) {
	
		//String sql_seq = "select emp_seq.nextval from dual";
		String sql_seq = "SELECT MAX(EMPLOYEE_ID)+1 FROM EMPLOYEES";
		
		String sql = "INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME ,"
							+ " EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT,"
							+ " MANAGER_ID, DEPARTMENT_ID) "+
		            " VALUES( ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?)";
		
		BigDecimal seq = null;
		
		try {			
			conn = ConnectionManager.getConnect();	
			
			//시퀀스 조회
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql_seq);
			if(rs.next())
				seq = rs.getBigDecimal(1);
			
			//사원등록
			pstmt = conn.prepareStatement(sql);
			pstmt.setBigDecimal(1,seq);
			pstmt.setString(2,emp.getFirstName());
			pstmt.setString(3,emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhoneNumber());
			pstmt.setString(6, emp.getHireDate());
			pstmt.setString(7, emp.getJobId());
			pstmt.setString(8, emp.getSalary());
			pstmt.setString(9, emp.getCommissionPct());
			pstmt.setString(10, emp.getManagerId());
			pstmt.setString(11, emp.getDepartmentId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			ConnectionManager.disconnect(conn);
		}
		return true;
	}

	
	// 수정된 사원정보 내용 갱신을 위한 메서드
	public boolean updateDB(Employee emp) {

		String sql ="UPDATE EMPLOUEES SET "
						+ " FIRST_NAME = ?, "
						+ " LAST_NAME = ?, "
						+ " EMAIL = ?, "
						+ " PHONE_NUMBER = ?, "
						+ " HIRE_DATE = ?, "
						+ " JOB_ID = ?, "
						+ " SALARY = ?, "
						+ " COMMISSION_PCT = ?, "
						+ " MANAGER_ID = ?, "
						+ " EMPLOYEE_ID = ? "
				   +" WHERE EMPLOYEE_ID = ?";			 
		try {
			conn = ConnectionManager.getConnect();					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,emp.getFirstName());
			pstmt.setString(2,emp.getLastName());
			pstmt.setString(3,emp.getEmail());
			pstmt.setString(4,emp.getPhoneNumber());
		//	pstmt.setDate(5,emp.getHire_date());   java.util.date -> java.sql.date
			pstmt.setString(6,emp.getSalary());
			pstmt.setString(7,emp.getCommissionPct());
			pstmt.setString(8,emp.getManagerId());
			pstmt.setString(9,emp.getEmployeeId());
			pstmt.setString(10,emp.getPhoneNumber());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			ConnectionManager.disconnect(conn); 
		}
		return true;
	}
	
	
	// 삭제
	public void deleteEmployees(int emp_id) {
		try {
			conn = ConnectionManager.getConnect();
			stmt = conn.createStatement();
			String sql = "delete from employees where employee_id = " + emp_id;
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 삭제 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.disconnect(conn);
		}
	}
	
	public Employee getEmployee(String employee_id) {
		Employee bean = null;
		try {
			// 1.DB연결
			conn = ConnectionManager.getConnect();
			// 4.sql 명령 실행
			String sql = " SELECT EMPLOYEE_ID,"
					+ "FIRST_NAME,"
					+ "LAST_NAME,"
					+ "EMAIL,"
					+ "PHONE_NUMBER,"
					+ "HIRE_DATE,"
					+ "JOB_ID,"
					+ "SALARY,"
					+ "COMMISSION_PCT,"
					+ "MANAGER_ID,"
					+ "DEPARTMENT_ID  "
			+ "  FROM EMPLOYEES "
			+ " WHERE EMPLOYEE_ID = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,employee_id);
			
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				bean = new Employee();
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
			ConnectionManager.disconnect(conn);
		}
		return bean;
	}
		
	// 전체 사원 목록을 가져오는 메서드
	public ArrayList<Employee> getEmployeeList() {
		ArrayList<Employee> datas = new ArrayList<Employee>();
		
		String sql = "select * from Employee order by EMPLOYEE_ID desc";
		try {
			conn = ConnectionManager.getConnect();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getString("EMPLOYEE_ID"));
				emp.setFirstName(rs.getString("FIRST_NAME"));
				emp.setLastName(rs.getString("LAST_NAME"));
				emp.setEmail(rs.getString("EMAIL"));
				emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				emp.setHireDate(rs.getString("HIRE_DATE"));
				emp.setJobId(rs.getString("JOB_ID"));
				emp.setSalary(rs.getString("SALARY"));
				emp.setCommissionPct(rs.getString("COMMISSION_PCT"));
				emp.setManagerId(rs.getString("MANAGER_ID"));
				emp.setDepartmentId(rs.getString("DEPARTMENT_ID"));			
				datas.add(emp);
			}
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			ConnectionManager.disconnect(conn);
		}
		return datas;
	}
	public ArrayList<Map<String, Object>> getEmployeeListMap() {
		Connection conn = null;
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		HashMap<String, Object> map = null;
		try {
			// 1.드라이버 로딩	// 2.DB연결
			conn = ConnectionManager.getConnect();
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
			ConnectionManager.disconnect(conn);
		}
		return list;
	}


	public ArrayList<Employee> getEmpPage(int start, int end) {
		Connection conn = null;
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee bean = null;
		try {
			// 1.드라이버 로딩	// 2.DB연결
			conn = ConnectionManager.getConnect();
			// 4.sql 명령 실행
			String sql = "select * from ( select rownum rnum, a.* from ( "
					+ " select first_name, last_name, email, hire_date, department_id from EMPLOYEES "
					+ " ) a ) b where rnum >= ? and rnum <= ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				bean = new Employee();
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
			/*try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}*/
			ConnectionManager.disconnect(conn);
		}
		return list;
	}

	
}

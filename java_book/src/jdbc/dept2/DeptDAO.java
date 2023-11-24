package jdbc.dept2;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;

/**
 * File : DeptDAO.java
 * Desc : 부서관리 DAO 클래스
 * @author 김유미
 */
public class DeptDAO { 
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	
	// Oracle 연결정보
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@127.0.0.1:1521";
	
	//싱글톤 구현
	static DeptDAO instance;	
	public static DeptDAO getInstance() {
		if (instance == null)
			instance = new DeptDAO();
		return instance;
	}
		
	// DB연결 메서드
	void connect() {
		try {
			Class.forName(jdbc_driver);

			conn = DriverManager.getConnection(jdbc_url,"hr","hr");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결해제
	void disconnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 수정된 부서정보 내용 갱신을 위한 메서드
	public boolean updateDB(Dept dept) {

		
		String sql ="update departments set "
				        + " location_id =?, "
				        + " manager_id =?, "
				        + " department_name=? "
				   +" where department_id=?";			 
		try {
			
			connect();		
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dept.getLocationId());
			pstmt.setString(2,dept.getManagerId());
			pstmt.setString(3,dept.getDepartmentName());
			pstmt.setString(4,dept.getDepartmentId());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			disconnect();
		}
		return true;
	}
	
	// 특정 부서정보 삭제 메서드
	public boolean deleteDB(Dept dept) {
		
		String sql ="delete from departments where department_id=?";
		
		try {
			connect();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dept.getDepartmentId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			disconnect();
		}
		return true;
	}
	
	// 신규 부서 추가 메서드
	public boolean insertDB(Dept dept) {
	
		//String sql_seq = "select dept_seq.nextval from dual";
		String sql_seq = "SELECT MAX(DEPARTMENT_ID)+10 FROM DEPARTMENTS";
		
		String sql = "INSERT INTO DEPARTMENTS (DEPARTMENT_ID, LOCATION_ID, MANAGER_ID, DEPARTMENT_NAME) "+
		            " VALUES( ?, ?, ?, ?)";
		
		BigDecimal seq = null;
		
		try {
			
			connect();	
			
			//시퀀스 조회
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql_seq);
			if(rs.next())
				seq = rs.getBigDecimal(1);
			
			//부서등록
			pstmt = conn.prepareStatement(sql);
			pstmt.setBigDecimal(1,seq);
			pstmt.setString(2,dept.getLocationId());
			pstmt.setString(3,dept.getManagerId());
			pstmt.setString(4, dept.getDepartmentName());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			disconnect();
		}
		return true;
	}

	// 부서 단건 조회
	public Dept getDB(int gb_id) {
		connect();		
		String sql = " SELECT D.DEPARTMENT_ID, "
					+ "       D.DEPARTMENT_NAME, "
					+ "       D.LOCATION_ID,  "
					+ "       D.MANAGER_ID    "
					+ "  FROM DEPARTMENTS D "
					+ " WHERE D.DEPARTMENT_ID = ? ";
		Dept dept = new Dept();		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,gb_id);
			ResultSet rs = pstmt.executeQuery();			
			// 데이터가 하나만 있으므로 rs.next()를 한번만 실행 한다.
			rs.next();
			dept.setDepartmentId(rs.getString("department_id"));
			dept.setDepartmentName(rs.getString("department_name"));
			dept.setLocationId(rs.getString("location_id"));
			dept.setManagerId(rs.getString("manager_id"));
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			disconnect();
		}
		return dept;
	}
	
	// 부서 단건 조회
	public Map<String,Object> getDBDetail(int gb_id) {
		String sql = " SELECT D.DEPARTMENT_ID, "
					+ "       D.DEPARTMENT_NAME, "
					+ "       D.LOCATION_ID,  "
					+ "       D.MANAGER_ID,    "
					+ "       L.STREET_ADDRESS,"
					+ "       E.FIRST_NAME || ' ' || E.LAST_NAME AS MANAGER_NAME "
					+ "  FROM DEPARTMENTS D, "
					+ "       EMPLOYEES E,  "
					+ "       LOCATIONS L "
					+ " WHERE D.LOCATION_ID   = L.LOCATION_ID(+) "
					+ "   AND D.MANAGER_ID    = E.EMPLOYEE_ID(+) "
					+ "   AND D.DEPARTMENT_ID = ? ";
		
		Map<String,Object> dept = null;	
		
		try {

			connect();		
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,gb_id);
			ResultSet rs = pstmt.executeQuery();			
			// 데이터가 하나만 있으므로 rs.next()를 한번만 실행 한다.
			if( rs.next() ) {
				dept = new HashMap<String,Object>();
				dept.put("departmentId",rs.getString("department_id"));
				dept.put("departmentName",rs.getString("department_name"));
				dept.put("locationId",rs.getString("location_id"));
				dept.put("managerId",rs.getString("manager_id"));
				dept.put("streetAddress",rs.getString("street_address"));
				dept.put("managerName",rs.getString("manager_name"));
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			disconnect();
		}
		return dept;
	}
	
	// 전체 부서 목록을 가져오는 메서드
	public ArrayList<Dept> getDBList() {
		connect();
		ArrayList<Dept> datas = new ArrayList<Dept>();
		
		String sql = "select * from departments order by department_id desc";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Dept dept = new Dept();
				dept.setDepartmentId(rs.getString("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setLocationId(rs.getString("location_id"));
				dept.setManagerId(rs.getString("manager_id"));			
				datas.add(dept);
			}
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			disconnect();
		}
		return datas;
	}
	
	
	// 부서별 인원수 조회
	public ArrayList<Map<String, Object>> getDeptEmpCnt() {
		connect();
		ArrayList<Map<String, Object>> datas = new ArrayList<Map<String, Object>>();
		
		String sql = " SELECT DEPARTMENT_NAME, COUNT(EMPLOYEE_ID) AS EMP_CNT"
					+ "  FROM EMPLOYEES E, DEPARTMENTS D"
					+ " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID"
					+ " GROUP BY DEPARTMENT_NAME";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> dept = new HashMap<String, Object>();
				dept.put("department_name",rs.getString("department_name"));
				dept.put("emp_cnt",rs.getInt("emp_cnt"));
				datas.add(dept);
			}
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			disconnect();
		}
		return datas;
	}	
}
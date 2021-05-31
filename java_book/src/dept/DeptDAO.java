package dept;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.DAO;

public class DeptDAO extends DAO {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//싱글톤 구현
	public static DeptDAO instance = new DeptDAO();
	public static DeptDAO getInstance() {
		return instance;
	}
	
	// Create, Read, Update, Delete
	public int insert(DeptBeans bean) {
		int r = 0;
		try{
			//1. connect
			conn = connect();
			String sql = "insert into departments (department_id, "
					+ " department_name, location_id, manager_id ) "
					+ " values( (select max(department_id)+10 from departments),"
					+ "   ?,?,?) ";
			//2 sql 구문 준비
			pstmt = conn.prepareStatement(sql);
			//3. sql 구문 실행
			pstmt.setString(1, bean.getDepartmentName());
			pstmt.setString(2, bean.getLocationId());
			pstmt.setString(3, bean.getManagerId());
			r = pstmt.executeUpdate();			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//4.연결해제
			disconnect(conn);  
		}
		return r;
	}
	public int update(DeptBeans bean) {
		int r = 0;
		return r;
	}
	public int delete(BigDecimal depaertmentId) {
		int r = 0;
		return r;
	}
	//단건조회
	public DeptBeans selectOne(DeptBeans bean) {
		DeptBeans result = null;
		try{
			conn = connect();
			String sql = "select * from departments where department_id=" 
			               + bean.getDepartmentId()  ;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {   //첫번째 레코드로 이동
				result = new DeptBeans();
				result.setDepartmentName(rs.getString("Department_Name"));
				result.setDepartmentId(rs.getString("Department_id"));
				result.setManagerId(rs.getString("manager_id"));
				result.setLocationId(rs.getString("location_id"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	//다건조회
	public List<Map<String,Object>> selectAll() {
		//결과변수
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		try {
			//1. 드라이버 로딩, 커넥터
			conn = connect();			
			//2. statement(구문) 실행
			String sql = "select * from departments";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);			
			//3. 결과처리			
			while(rs.next()) {
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("departmentId", rs.getInt("department_id"));
				map.put("departmentName", rs.getString("department_name"));
				map.put("managerId", rs.getInt("manager_id"));
				map.put("locationId", rs.getBigDecimal("location_id"));
				list.add(map);
			}			
			//4. disconnect
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//페이징처리조회
	
	//전체조회
	public List<DeptVO> getDeptList(DeptSearchVO searchVO) {
		List<DeptVO> list = new ArrayList<DeptVO>();
		DeptVO vo = null;
		String whereCondition = " where 1 = 1 ";
		if(searchVO.getLocation_id() != null && !searchVO.getLocation_id().equals("")) {
			whereCondition += " and location_id = ? ";
		}
		if(searchVO.getManager_id() != null && !searchVO.getManager_id().equals("")) {
			whereCondition += " and manager_id = ? ";
		}
		try {			
			conn = ConnectionManager.connect();			
			String sql = "select b.*  from( select a.*, rownum rn  from ( "
			        +   "SELECT department_id, department_name, manager_id, location_id "
					+   "  FROM departments"
			        +   whereCondition					
					+   " ORDER BY department_id "
					+   " ) a   ) b  where rn between ? and ?	";
			pstmt = conn.prepareStatement(sql);
			int pos = 1;
			if(searchVO.getLocation_id() != null && !searchVO.getLocation_id().equals("")) {
				pstmt.setString(pos++, searchVO.getLocation_id());
			}
			if(searchVO.getManager_id() != null && !searchVO.getManager_id().equals("")) {
				pstmt.setString(pos++, searchVO.getManager_id());
			}
			pstmt.setInt(pos++, searchVO.getStart());
			pstmt.setInt(pos++, searchVO.getEnd());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new DeptVO();
				vo.setDepartment_id(rs.getString("department_id"));
				vo.setDepartment_name(rs.getString("department_name"));
				vo.setManager_id(rs.getString("manager_id"));
				vo.setLocation_id(rs.getString("location_id"));
				list.add(vo);
			}
		} catch(Exception e) {	e.printStackTrace();
		} finally{
			ConnectionManager.close(conn);
		}
		return list;
	}	
	
	//레코드 건수 조회
	public int count(DeptSearchVO searchVO) {
		int cnt = 0;
		try {
			conn = ConnectionManager.connect();
			//동적 조건 추가
			String whereCondition = " where 1 = 1 ";
			if(searchVO.getLocation_id() != null && !searchVO.getLocation_id().equals("")) {
				whereCondition += " and location_id = ? ";
			}
			if(searchVO.getManager_id() != null && !searchVO.getManager_id().equals("")) {
				whereCondition += " and manager_id = ? ";
			}
			
			String sql = "select count(*) from departments" + whereCondition;
			pstmt = conn.prepareStatement(sql);

			// 조건값 셋팅
			int pos = 1;
			if(searchVO.getLocation_id() != null && !searchVO.getLocation_id().equals("")) {
				pstmt.setString(pos++, searchVO.getLocation_id());
			}
			if(searchVO.getManager_id() != null && !searchVO.getManager_id().equals("")) {
				pstmt.setString(pos++, searchVO.getManager_id());
			}
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt(1);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionManager.close(conn);
		}
		return cnt;
	}
	
	//부서별 사원현황 조회
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public List<DeptEmpSet> getDeptEmpList() {
		List<DeptEmpSet> sList = new  ArrayList<DeptEmpSet>();
		PreparedStatement pstmtEmp;
		try {
			conn = ConnectionManager.connect();
			
			//부서목록
			String sql = "select department_id, department_name from departments";
			pstmt = conn.prepareStatement(sql);
			
			//사원목록 쿼리문 
			String sqlEmp = "select employee_id, first_name, last_name from employees "
					      +  " where department_id = ?";
			pstmtEmp = conn.prepareStatement(sqlEmp);			
			
			ResultSet rs = pstmt.executeQuery();
			DeptVO dept;
			while(rs.next()) {
				//부서 한건 정보를 VO 저장
				dept = new DeptVO();
				dept.setDepartment_id(rs.getString("department_id"));
				dept.setDepartment_name(rs.getString("department_name"));
				//해당 부서별 사원목록 조회
				pstmtEmp.setString(1, dept.getDepartment_id());
				ResultSet rsEmp = pstmtEmp.executeQuery();
				List<EmpVO> empList = new ArrayList<EmpVO>();
				while(rsEmp.next()) {
					EmpVO empVO = new EmpVO();
					empVO.setEmployee_id(rsEmp.getString("employee_id"));
					empVO.setFirst_name(rsEmp.getString("first_name"));
					empVO.setLast_name(rsEmp.getString("last_name"));
					empList.add(empVO);
				}				
				//부서정보와 해당부서의 부서원을 deptEmpSet에 담아서 리스트에 추가
				DeptEmpSet deptEmpSet = new DeptEmpSet();
				deptEmpSet.setDeptVO(dept);
				deptEmpSet.setEmpList(empList);
				
				sList.add(deptEmpSet);				
			}				
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn);
		}		
		return sList;
	}	
}

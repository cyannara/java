package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.ConnectionManager;

/*
 * DAO : Data Access Object (DB처리)
 */
public class DeptDAO {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	
	//등록
	public void deptInsert(DeptVO vo) {		
		try {
			conn = ConnectionManager.connect();
			//트랙잭션 모드 변경(autocommit 해제)
			conn.setAutoCommit(false);
			String sql = " insert into departments(department_id, "
				 	+    " department_name, manager_id, location_id)"
					+    " values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getDepartment_id());
			pstmt.setString(2, vo.getDepartment_name());
			pstmt.setString(3, vo.getManager_id());
			pstmt.setString(4, vo.getLocation_id());
			
			pstmt.executeUpdate();

			conn.commit();  //정상실행이면 커밋
			
		} catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();  //에러나면 롤백
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//수정
	public void deptUpdate(DeptVO vo) {		
		try {
			conn = ConnectionManager.connect();
			String sql = " UPDATE departments set      "
				 	+    " department_name = ?, "
				 	+    "        manager_id = ?,      "
				 	+    "        location_id = ?      "
				 	+    "  WHERE department_id = ?    ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getDepartment_name());
			pstmt.setString(2, vo.getManager_id());
			pstmt.setString(3, vo.getLocation_id());
			pstmt.setString(4, vo.getDepartment_id());
			pstmt.executeUpdate();			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//삭제
	public void deptDelete(String department_id) {		
		try {
			conn = ConnectionManager.connect();
			String sql = " DELETE FROM departments  "
				 	+    "  WHERE department_id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, department_id);
			pstmt.executeUpdate();			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//단건조회
	public DeptVO getDept(String department_id) {
		DeptVO vo = null;
		try {
			conn = ConnectionManager.connect();
			String sql ="SELECT department_id, department_name, manager_id, location_id "
					+   "  FROM departments"
					+   " WHERE department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, department_id);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new DeptVO();
				vo.setDepartment_id(rs.getString("department_id"));
				vo.setDepartment_name(rs.getString("department_name"));
				vo.setManager_id(rs.getString("manager_id"));
				vo.setLocation_id(rs.getString("location_id"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			try {  
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}  
		return vo;
	}
	
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











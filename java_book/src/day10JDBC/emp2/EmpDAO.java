package jdbc.emp2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 *  VO : Value Object  == EmpDTO,  EmoDO, Emp
 *  DAO : Data Access Object
 */
public class EmpDAO {

	Connection conn;
	PreparedStatement pstmt;
	
	//전체조회  select * from employees
	public ArrayList<EmpVO> selectList() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			conn = JdbcUtil.connect();
			String sql = "SELECT    EMPLOYEE_ID,"
								+ " FIRST_NAME,"
								+ " LAST_NAME,"
								+ " EMAIL,"
								+ " PHONE_NUMBER,"
								+ " HIRE_DATE,"
								+ " JOB_ID,"
								+ " SALARY,"
								+ " COMMISSION_PCT,"
								+ " MANAGER_ID,"
								+ " DEPARTMENT_ID"
					   + " FROM employees"
					  + " ORDER BY EMPLOYEE_ID ";
			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			while( rs.next() ) {
				vo = new EmpVO();
				vo.setEmployee_id(rs.getString(1));
				vo.setFirst_name(rs.getString("FIRST_NAME"));
				list.add(vo);
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JdbcUtil.disconnect(conn);
		}
		
		return list;
	}
	
	//단건조회  select * from employees where employee_id=? 
	public EmpVO selectOne(String id) {
		EmpVO vo = null;
		try {
			conn = JdbcUtil.connect();
			String sql = "SELECT    EMPLOYEE_ID,"
								+ " FIRST_NAME,"
								+ " LAST_NAME,"
								+ " EMAIL,"
								+ " PHONE_NUMBER,"
								+ " HIRE_DATE,"
								+ " JOB_ID,"
								+ " SALARY,"
								+ " COMMISSION_PCT,"
								+ " MANAGER_ID,"
								+ " DEPARTMENT_ID"
					   + " FROM employees"
					  + " WHERE employee_id=? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if ( rs.next() ) {
				vo = new EmpVO();
				vo.setEmployee_id(rs.getString(1));
				vo.setFirst_name(rs.getString("FIRST_NAME"));
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JdbcUtil.disconnect(conn);
		}
		return vo;
	}
	
	//전체조회
	
	public void insert(EmpVO vo) {
		try {
			//1. connect(연결)
			JdbcUtil.connect();			
			//2. statement (구문)
			String sql = "INSERT INTO EMPLOYEES"
					            + " EMPLOYEE_ID,"
								+ " LAST_NAME,"
								+ " EMAIL,"
								+ " HIRE_DATE,"
								+ " JOB_ID "
					        + " VALUES (?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);			
			//3. execute(실행)
			pstmt.setString(1, vo.getEmployee_id());
			pstmt.setString(2, vo.getLast_name());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getHire_date());
			pstmt.setString(5, vo.getJob_id());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 등록됨");			
			//4. resultset(select라면 조회결과처리)
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			//5. close(연결해제)
			JdbcUtil.disconnect(conn);
		}
	}
	public void update(EmpVO vo) {
		try {
			//1. connect(연결)
			JdbcUtil.connect();
			
			//2. statement (구문)
			
			//3. execute(실행)
			
			//4. resultset(select라면 조회결과처리)
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			//5. close(연결해제)
			JdbcUtil.disconnect(conn);
		}
	}	
}

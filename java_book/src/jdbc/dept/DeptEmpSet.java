package jdbc.dept;

import java.util.List;

public class DeptEmpSet {
	
	DeptVO deptVO;
	List<EmpVO> empList;
	
	public DeptVO getDeptVO() {
		return deptVO;
	}
	public void setDeptVO(DeptVO deptVO) {
		this.deptVO = deptVO;
	}
	public List<EmpVO> getEmpList() {
		return empList;
	}
	public void setEmpList(List<EmpVO> empList) {
		this.empList = empList;
	}
	
}

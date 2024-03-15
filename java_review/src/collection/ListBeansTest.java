package collection;

import java.util.ArrayList;
import java.util.List;

class EmpBeans {
	private String empno;
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;

	public EmpBeans() {
	}

	public EmpBeans(String empno, String ename, String sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "EmpBeans [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}

}

public class ListBeansTest {
	public static void main(String[] args) {
		
		List<EmpBeans> list = new ArrayList<EmpBeans>();
		
		//add
		list.add(new EmpBeans("100", "hong", "2000"));
		list.add(new EmpBeans("101", "kim", "2500"));
		list.add(new EmpBeans("102", "choi", "1000"));
		
		//이름만 출력 - for
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getEname() );
		}
		
		//전체급여합계
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += Integer.parseInt( list.get(i).getSal() )  ;
		}
		
		System.out.println("total:" + sum);
		
	}

}











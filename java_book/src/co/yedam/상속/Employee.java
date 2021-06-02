package co.yedam.상속;
public abstract class Employee {	
	protected String empNo;
	protected String empName;
	protected int salary;
	public Employee(String empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	public Employee() {}
	public String getEmpNo() { 	return empNo;	}
	public void setEmpNo(String empNo) { this.empNo = empNo;	}
	public String getEmpName() { return empName; 	}
	public void setEmpName(String empName) {this.empName = empName;	}
	public int getSalary() { return salary;	}	
	public abstract void calc() ;
}

package co.yedam.emp;
/* 사원정보  */
public class Employee {
	int 	employeeId;	 //사번
	String 	name;		 //이름
	int 	departmentId;//부서번호   10:인사 20:개발 30:영업(기본값)
	String  departmentName; //부서명
	int 	salary;		 //급여
	String 	email;		 //이메일
	
	public Employee() {
		this(0, "", 0, 0 ,"") ;
	}			
	public Employee(int employeeId, String name) {
		this(employeeId, name, 0, 0,"") ;
	}
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, 0, salary, "") ;
//		this.employeeId = employeeId;
	}
	public Employee(int employeeId, String name, String email) {
		this(employeeId, name, 0, 0 ,email);
	}
	public Employee(int employeeId, String name, int departmentId, int salary, String email) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.email = email;
		
		this.departmentId = departmentId;
		
		if(this.departmentId == 0)
			this.departmentId = 30;
		
		if(this.departmentId == 10 ) {
			this.departmentName ="인사";
		} else if(this.departmentId == 20) {
			this.departmentName ="개발";
		} else {
			this.departmentName ="영업";
		}
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", departmentId=" + departmentId
				+ ", departmentName=" + departmentName + ", salary=" + salary + ", email=" + email + "]";
	}
}

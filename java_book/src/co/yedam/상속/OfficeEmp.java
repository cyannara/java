package co.yedam.상속;
public class OfficeEmp extends Employee {
	private int annual;
	public OfficeEmp(String empNo, String empName, int annual) {
		super(empNo, empName);
		this.annual = annual;
	}
	public void calc() {		salary = annual/13; 	}
	public String toString() {
		return empNo +":" + empName + ":" + salary;
	}
}

package 상속;

public class HourEmp extends Employee {
	private int time;
	private int price;
	public HourEmp(String empNo, String empName, int time, int price) {
		super(empNo, empName);
		this.time = time;
		this.price = price;
	}
	public void calc() {		salary = time * price; 	}
	public String toString() {
		return empNo +":" + empName + ":" + salary;
	}
}

package chap03.제어문;

import java.io.Serializable;

enum Gender {	MALE, FEMALE }

public class EmpVO  implements Serializable   {
	
	private String employee_id;
	private String first_name;
	private String last_name;
	private int salary;	
	private Gender gen;	
	
	public EmpVO() {}
	
	public EmpVO(String employee_id, Gender gen) {
		super();
		this.employee_id = employee_id;
		this.gen = gen;
	}

	public EmpVO(String employee_id, String first_name, String last_name, int salary) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	public Gender getGen() {
		return gen;
	}
	public void setGen(Gender gen) {
		this.gen = gen;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	@Override
	public String toString() {
		return "EmpVO [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", salary=" + salary + "]";
	}
}

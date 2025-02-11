package lambdaStream;

public class EmpVO {
	
	String name;
	int sal;
	
	public EmpVO() {}
	
	public EmpVO(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "EmpVO [name=" + name + ", sal=" + sal + "]";
	}
	
	
}

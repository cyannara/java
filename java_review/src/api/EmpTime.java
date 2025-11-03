package egovframework.example;

public class EmpTime {
	int no;
	String name;
	int workTime;
	
	public EmpTime(int no, String name, int workTime) {
		super();
		this.no = no;
		this.name = name;
		this.workTime = workTime;
	}

	@Override
	public String toString() {
		return "EmpTime [no=" + no + ", name=" + name + ", workTime=" + workTime + "]";
	}
	
	
}

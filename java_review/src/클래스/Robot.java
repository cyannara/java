package 클래스;

//1. 클래스 정의
public class Robot {

	private int arm;
	int leg;
	
	public Robot() {}

	public Robot(int arm, int leg) {
		super();
		this.arm = arm;
		this.leg = leg;
	}
//접근제어자(메서드)
	public void setArm(int arm) {
		this.arm = arm;
	}

/*	public void setArm(int arm) {
		this.arm = arm;
	}*/
	
}


package co.yedam.클래스;

//1. 클래스 선언
public class Robot {

	//필드
	//private(클래스 내부에서만 접근가능) : 접근제어자
	private int arm;
	int leg;
	

	//생성자 오버로딩
	//기본생성자
	//public Robot() {}   //컴파일러가 만들어주는 기본 생성자
	public Robot(int arm, int leg) {
		this.arm = arm;   //this는 자기자신 객체를 참조하는 참조변수
		this.leg  =leg;
	}
	
	//setter :필드값을 변경
	//getter :필드값을 조회
	public int getArm() {
		return arm;
	}

	public void setArm(int arm) {
		this.arm = arm;
	}
	
	//일반메서드	
	public void print() {
		System.out.printf("arm :%d leg:%d", arm,leg);
	}

	@Override
	public boolean equals(Object obj) {
		Robot r2 =  ((Robot)obj);
		return r2.arm == this.arm && r2.leg == this.leg;
	}

	@Override
	public String toString() {
		return "arm:" + arm + "leg:" + leg;
	}
}


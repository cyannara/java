package day07.member;

//교수
public class Prof extends Member {
	
	String dept;

	@Override  //상속받은 메서드를 재정의
	public void sal() {
		System.out.println("교수 급여");
	}

	@Override
	public void print() {
		super.print();
		System.out.println("교수");
	}
	
}

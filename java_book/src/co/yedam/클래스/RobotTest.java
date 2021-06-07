package co.yedam.클래스;

public class RobotTest {

	public static void change(int a) {
		a += 10;
	}
	
	public static void change(Robot robot) {
		robot.setArm(5);
	}
	
	public static void main(String[] args) {
		
		//2. 객체생성
		Robot r = new Robot(2,4);
		change(r);
		System.out.println(r.getArm());
		
		int a = 1;
		change(a);
		System.out.println(a);
		
//		//3. 객체사용
//		r.setArm(2);
//		r.leg = 4;
//		r.print();
//		
//		Robot r2 = new Robot(2,2);
		
	
	}
}

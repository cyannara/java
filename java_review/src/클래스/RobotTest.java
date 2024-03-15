package 클래스;

public class RobotTest {

	public static void main(String[] args) {
		
		
		//2. 객체생성
		Robot r = new Robot();
		
		//3. 객체 사용(초기화)
		r.setArm(2);
		r.leg = 4;
		
		
		Robot r2 = new Robot(4,4);
	}
}

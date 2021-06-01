package 클래스;

public class RobotTest {

	public static void main(String[] args) {
		
		//2. 객체생성
		Robot r = new Robot(2,4);
		
		//3. 객체사용
		r.setArm(2);
		r.leg = 4;
		r.print();
		
		Robot r2 = new Robot(2,2);
		
	
	}
}

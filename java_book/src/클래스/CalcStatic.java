package 클래스;

public class CalcStatic {
	//final : (상수) 변경불가
	//static : 모든 객체가 공유하는 필드 
	final static double PI = 3.14;

	@Override
	public String toString() {
		return "CalcStatic [pi=" + PI + "]";
	}

	public static int add(int inNum1, int inNum2) {
		return  inNum1 + inNum2;
	}
	
}

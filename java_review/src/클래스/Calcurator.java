package 클래스;

/**
 * 초등 저학년을 위한 사칙연산 계산기
 * 
 * @author user
 *
 */
public class Calcurator {

	// 필드
	protected int inNum1;
	protected int inNum2;
	protected int result;
	
	public static String name = "YEDAM";

	// 생성자 : public, no return, 메서드명은 클래스명과 동일
	// 필드를 초기화
	public Calcurator(int inNum1, int inNum2) {
		this.inNum1 = inNum1;
		this.inNum2 = inNum2;
	}

	// default 생성자(인수가 없는 생성자)
	public Calcurator() {
	}

	// 메서드 (setter/getter)
	public int getResult() {
		return result;
	}

	public void setInNum1(int inNum1) {
		this.inNum1 = inNum1;
	}

	public void setInNum2(int inNum2) {
		this.inNum2 = inNum2;
	}

	// 일반 메서드
	// 덧셈
	public void add() {
		result = inNum1 + inNum2;
	}

	// 뺄셈
	public void sub() {
		result = inNum1 - inNum2;
	}

	// 곱셈
	public void mul() {
		result = inNum1 * inNum2;
	}
	// 나눗셈
	public void div() {
		result = inNum1 / inNum2;
	}
}

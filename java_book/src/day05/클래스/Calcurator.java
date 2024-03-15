package day05.클래스;

/**
 * @author user
 *
 */
public class Calcurator {

	//필드
	protected int inNum1;
	protected int inNum2;
	protected int result;
	
	public static String name = "YEDAM";

	// 생성자 : public, no return, 클래스명과 동일
	public Calcurator(int inNum1, int inNum2) {
		this.inNum1 = inNum1;
		this.inNum2 = inNum2;
	}

	// default 생성자
	public Calcurator() {
	}

	//(setter/getter)
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

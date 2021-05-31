package 클래스;

/**
 * �ʵ� ���г��� ���� ��Ģ���� ����
 * 
 * @author user
 *
 */
public class Calcurator {

	// �ʵ�
	protected int inNum1;
	protected int inNum2;
	protected int result;
	
	public static String name = "YEDAM";

	// ������ : public, no return, �޼������ Ŭ������� ����
	// �ʵ带 �ʱ�ȭ
	public Calcurator(int inNum1, int inNum2) {
		this.inNum1 = inNum1;
		this.inNum2 = inNum2;
	}

	// default ������(�μ��� ���� ������)
	public Calcurator() {
	}

	// �޼��� (setter/getter)
	public int getResult() {
		return result;
	}

	public void setInNum1(int inNum1) {
		this.inNum1 = inNum1;
	}

	public void setInNum2(int inNum2) {
		this.inNum2 = inNum2;
	}

	// �Ϲ� �޼���
	// ����
	public void add() {
		result = inNum1 + inNum2;
	}

	// ����
	public void sub() {
		result = inNum1 - inNum2;
	}

	// ����
	public void mul() {
		result = inNum1 * inNum2;
	}
	// ������
	public void div() {
		result = inNum1 / inNum2;
	}
}

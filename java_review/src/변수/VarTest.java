package ����;
/**
 * date : 2017/10/16 
 * @author kim yoomi
 * @since jdk1.2
 * @version 1.8
 * ���� �׽�Ʈ
 * 1. ������� ���������� �ִ�.
 * ������ ��� -int,   �Ǽ��� ��� - double
 *         10L               10.456F
 * 2. ������ �ִ밪(ǥ������)
 *    �Ǽ��� ��ȿ�ڸ���     
 * 3. �������� :  boolean
 *             char
 *             byte, short, int, long
 *             float, double            
 */
public class VarTest {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE ;		//������ ��� �⺻��
		long a = 2200000000L;
		float b = 10.12345678912345f;
		double c = 10.12345678912345;  // �Ǽ��� ��� �⺻��
		
		System.out.println("������ �ִ밪:" + i );
		System.out.println("������ �ִ밪 + 1:" + (i+2) );
		
		long d =Long.MAX_VALUE;   //Long
		System.out.println("�� ������ �ִ밪:" + d );
		
		System.out.println( "float " + b + " double " + c );
		
		//char �� 
		char e = 'A';
		int f = 'A';    //65
		char g = '��';
		System.out.println("�� �� �ڵ尪:" + (int)g);
		
		g = '\uac01';
		System.out.println("ac01: " + g);
		
		//10������ 16������   toString( ,16)
		System.out.println( Integer.toString(g,16) );
		
		//�ƽ�Ű�ڵ� ���
		for ( int j = 1; j<127 ; j++ ) {
		//	System.out.println( j + " : " + (char)j );	
		}
		
		
		//�ѱ� ���
		for ( int j = 44032; j<45000 ; j++ ) {
			System.out.println( j + " : " + (char)j );	
		}
		 
	}
	/**
	 * ���� �޼���
	 * 
	 */
	public static void sub1() {
		
	}
}

package day01.데이터타입;
/*
 * �������� ����
 *                200    200L    10.5F  10.5
 *                �⺻                    �⺻
 *   1     2       4      8       4       8
 * byte > short > int > long                          ����
 *                              > float > double      �Ǽ�
 *        char                                        ����
 * boolean                                            ��   
 */
public class TypeTest {
	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Long.MAX_VALUE);
		long a = 2200000000L;    //
		
		float f = 0.123456789f;           //��ȿ�ڸ��� 7�ڸ�
		System.out.println(f);
		
		double d = 0.1234567890123456789; //��ȿ�ڸ��� 16�ڸ�
		System.out.println(d);
		
		//����ǥ��   2����:0b   8����:0  16����:0x
		//0���� �����ϸ� 8����
		int  b = 0111;            	
		System.out.println("8���� 111=" + b);
		
		int b8 = 015 + 04;
		//10������ 8������ ��ȯ
		System.out.println(b8 + " " + Integer.toOctalString(b8)); 		
		//0x�� �����ϸ� 16����
		int b16 = 0xFF;			  	
		System.out.println(b16);		
		//0b�� �����ϸ� 2����
		int b2 = 0b1111;			
		System.out.println(b2);
		
		//char
		System.out.println("========================");
		char c1 = '가';
		System.out.println((int)c1);          	  	 //10����
		System.out.println(Integer.toHexString(c1)); //16����
		char c2 = '\uac01';
		int c3 = 44033;
		System.out.println(c2);
		System.out.println((char)c3);
		
		
		
				
				
	}
}

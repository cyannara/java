package day01;

public class CharTest {
	public static void main(String[] args) {
		
		//��ҹ���
		char c1 = 'A';  // 
		int c2 = c1 + 32;
		System.out.println( c2 + " " +  (char)c2  );
		
		char c3 = '\uac00';
		char c4 = 0xac00;
		char c5 = '��';
		char c6 = 44032;
		
		//���ڿ�
		String s = "�ȳ�\"\n\t�ϼ���\\";
		System.out.println(s);
	}
}

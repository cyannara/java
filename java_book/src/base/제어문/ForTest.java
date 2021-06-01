package base.제어문;
/*
 * 1���� 10���� Ȧ���� ���
 */
public class ForTest {
	public static void main(String[] args) {
		
		//���� ����
		
		int i=0;
		//���� for : �ʱ��, ���ǽ�, ������
	/*	for (i = 1; i < 10; i+=2) {
			System.out.println(i);
		}*/
		
		// �ѹ��� �������
	/*	for(;i<0;) {
			System.out.println(i);
		}*/
		
		// ���ѷ���
		/*for(;;) {
			System.out.println(i);
		}*/
		
		// 3�� ����� ��¾���
		for (i = 1; i < 10; i+=2) {
			if(i % 3 == 0 ) continue;
			if( i == 5) break;
			System.out.println(i);
		}
	}
}

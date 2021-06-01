package base.제어문;
/*
 * for, while, do while, break, continue, break label;
 */

public class  반복문{
	public static void main(String[] args) {


		int i=0;
		
		//while
		i = 1;						// �ʱ��
		while(i < 10) {				//���ǽ�			
			System.out.println(i); 	//�ݺ��� ����
			i+=2;					//������
		}
		
		i = 1;
		do {
			//�ݺ��� ����
			System.out.println(i);
			i+=2;
		} while(i < 10);
	}
}

package ���;

public class ForTest {

	public static void main(String[] args) {

		int sum = 0;
		//10���� �հ��
		
		
		
		//�迭�� ��
		int[] arr = {1,2,3,4,5};
		sum = 0;
		for( int i=0; i< arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("�հ� : " + sum);
		
		sum = 0;
		for( int iter  : arr) {
			sum += iter;
		}
		System.out.println(sum);
	}

	
}

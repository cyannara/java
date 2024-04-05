package 제어문;

public class ForTest {

	public static void main(String[] args) {

		int sum = 0;
		//10까지 합계산
		
		
		
		//배열의 합
		int[] arr = {1,2,3,4,5};
		sum = 0;
		for( int i=0; i< arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
		
		sum = 0;
		for( int iter  : arr) {
			sum += iter;
		}
		System.out.println(sum);
	}
}

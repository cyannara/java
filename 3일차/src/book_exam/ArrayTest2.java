package book_exam;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];   //0~9
		//배열에 초기값 지정
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		//배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//합계
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		System.out.println("합계="+result);
		
		//최대값
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최댓값="+max);
	}
}

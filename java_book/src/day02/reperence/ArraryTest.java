package day02.reperence;

public class ArraryTest {

	public static void main(String[] args) {
		// TODO Int Array test
//		int[] score;  //배열선언
//		score = new int[6];  //초기화

		int[] score = new int[6];  //배열을 선언과 동시에 초기화
		for(int i = 0; i < score.length; i++) {
			score[i] = i+1;
		}
		
		int i = 0;
		for(int num : score) {  //  forEach 문 성능이 향상된 For
			
			System.out.println("배열 "+i+" 번째 요소값 = " + num);
			i++;
		}
		
//		String studentName = "홍길동";
//		String studentName1 = "김치국";
		
		String[] studentName = new String[30];
		studentName[0] = "홍길동";
		
	}

}

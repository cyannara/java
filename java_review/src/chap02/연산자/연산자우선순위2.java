package chap02.연산자;

/* 연산자 우선순위
 * 실행결과가 올바르게 나오도록 11라인의 코드를 수정하세요 
 */
public class 연산자우선순위2 {
	public static void main(String[] args) {
		
		int kor = 90;
		int eng = 80;
		double avg = (kor + eng) / 2;
		
		System.out.println("평균:" + avg);
		
		/* 실행결과 
		 * ================
		 * 평균:85.0
		 */
	}
}

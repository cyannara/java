package chap02.데이터타입;

/* 
 * 정수 / 정수  =>  정수
 * 정수 / 실수  =>  실수
 * 강제형변환
 */
public class 형변환 {
	public static void main(String[] args) {
	
		//실행결과는 56이 나옴. 소수점자리까지(58.666666666666664) 모두 표현되도록 코드를 수정하세요
		int total = 352;
		int count = 6;
		int avg = total / count;
		System.out.println(avg);
		
	}
}

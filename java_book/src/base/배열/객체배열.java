package base.배열;

import java.awt.Point;

/* 
 * 객체배열 : 배열의 요소 타입이 객체인 경우
 */
public class 객체배열{
	public static void main(String[] args) {
		
		//변수 선언
		Score[] a;
		
		//객체 생성
		a = new Score[10];
		
		//초기화
		a[0] = new Score("홍길동", 100, 90, 80);
		a[1] = new Score("김", 10, 90, 80);
		a[2] = new Score("박", 20, 90, 80);
		
		//이름만 출력
		for(int i=0; i<a.length; i++) {
			if (a[i] != null) {
				System.out.println(a[i].name);
			}
		}
		
		//선언과 동시에 초기화
		Score[] arr = {new Score("철수", 100, 90, 80),
				       new Score("영이", 10, 90, 80),
				       new Score("돌이", 10, 90, 80) };
		
		//일반 for문: 이용하여 이름과 평균 출력
		for(int i=0; i<arr.length;i++) {
			System.out.println (arr[i].name + ":" + arr[i].avg);
		}
		//확장 for문 : 이름과 총점을 출력 in : 
		for( Score score  : arr ) {
			System.out.println(score.name +":" +score.total);
		}
	
		//객체배열
		Point[] c = {new Point(10,10),
					 new Point(30,10),
					 new Point(30,30),
					 new Point(10,30) };
		
		//확장 for문을 이용하여 x,y좌표를 출력
		for(Point point : c ) {
			System.out.println(point.x +":" + point.y);
		}
	}
}

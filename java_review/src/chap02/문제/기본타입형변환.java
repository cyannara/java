package chap02.문제;
/*
  허용범위 크기순
  byte < short < int < long < float < double
 */
public class 기본타입형변환 {
	public static void main(String[] args) {
		int i = 5 / 2;   //p77 컴파일 단계에서 연산을 수행
		double d1 = (double)5 / 2;  
		System.out.println(i);
		System.out.println(d1);

		int i2 = 10;
		short s = i2;     //강제타입변환
		double d3 = i2;   //자동타입변환
		
		int i3 = '가';
		char c = i3;
	}
}

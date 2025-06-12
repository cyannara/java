package homework.chap03.baseball;

import java.util.Scanner;

/*
 * 임의의 수 3개
 * 사용자 수 입력
 * 스트라익, 볼 카운터 
 */
public class BaseBallApp {

	int s;		//스트라익 카운트 
	int b;		//볼 카운트	
	int c1,c2,c3; // 1~9 사이의 랜덤 값
	int u1,u2,u3; // 사용자 입력값
	Scanner scanner = new Scanner(System.in);
	
	public void start() {
		
		//숫자 3개 지정
		makeRnd();
		
		while(true ) {
			
			//사용자가 숫자 3개 입력
			userInput();
			
			//스트라익 볼 갯수 카운트
			strikeBallCount();
			
			//스트라익이 3개면 게임종료
			if(s == 3 ) {
				System.out.println("게임종료");
				break;
			}
			
			//턴횟수가 3회이상이면 게임오버
		}
	}
	
	
	void makeRnd() {
		c1=(int)(Math.random()*9)+1;
		do {
			c2=(int)(Math.random()*9)+1;
		} while (c1 == c2);
		do {
			c3=(int)(Math.random()*9)+1;
		} while(c3 == c1 || c3 == c2);
		System.out.println(c1 +":" + c2 +":" + c3);
	}
	
	void userInput() { 
		System.out.println("(1~9)입력:");
		u1 = scanner.nextInt();
		u2 = scanner.nextInt();
		u3 = scanner.nextInt();
	}
	
	void strikeBallCount() {
		s=0;
		b=0;
		// s, b 카운트
		if(u1 == c1 ) {	s++; }
		if(u2 == c2 ) {	s++; }
		if(u3 == c3 ) {	s++; }
		if(u1 == c2 || u1 == c3) { b++; }
		if(u2 == c1 || u2 == c3) { b++; }
		if(u3 == c1 || u3 == c2) { b++; }
		System.out.println("s:" + s + "  b:"+b);
	}
	

}

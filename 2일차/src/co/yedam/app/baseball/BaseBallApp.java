package co.yedam.app.baseball;

import java.util.Scanner;

/*
 * 임의의 수 3개
 * 사용자 수 입력
 * 스트라익, 볼 카운터 
 */
public class BaseBallApp {

	int s;
	int b;
	int c1,c2,c3;
	int u1,u2,u3;
	
	Scanner scanner = new Scanner(System.in);
	
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
	
	void input() { 
		System.out.println("(1~9)입력:");
		u1 = scanner.nextInt();
		u2 = scanner.nextInt();
		u3 = scanner.nextInt();
	}
	void count() {
		s=0;
		b=0;
		// s, b 카운터
		if(u1 == c1 ) {	s++; }
		if(u2 == c2 ) {	s++; }
		if(u3 == c3 ) {	s++; }
		if(u1 == c2 || u1 == c3) { b++; }
		if(u2 == c1 || u2 == c3) { b++; }
		if(u3 == c1 || u3 == c2) { b++; }
		System.out.println("s:" + s + "  b:"+b);
	}
	
	void start() {
		makeRnd();
		while(true ) {
			input();
			count();
			if(s == 3) {
				System.out.println("게임종료");
				break;
			}
		}
	}
}

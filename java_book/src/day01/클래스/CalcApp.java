package day01.클래스;

import java.util.Scanner;

/*
 * 계산기 게임
 * 사칙연산, 진수변환, 문자값 검사
 */
public class CalcApp {
	double a;
	double b;
	
	//1~cnt까지의 합을 계산해서 리턴
	int sum(int cnt) {
		int result = 0;
		//코드작성
		//
		return result;
	}
	
	void input() {
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력");
		String s1 = scanner.next();
		System.out.print("입력");
		String s2 = scanner.next();		
		//string -> double
		a = Double.parseDouble(s1); 
		b = Double.parseDouble(s2);
	}
	
	//정수값 두 수의 합을 계산 메서드(함수)
	double add() {
		return a+b;
	}	
	
	//두수의 몫을 계산  5/2  2  
	int share() {
		return (int)a /(int)b;
	}
	
	//두 수의 나눗셈    5/2  2.5
	double div() {
		return a / b;
	}
	
	//두 수의 나머지 연산  5%2  1
	double rest() {
		return a % b;
	}
	
}

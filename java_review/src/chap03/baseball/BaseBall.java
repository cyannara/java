package chap03.baseball;

import java.util.Scanner;

public class BaseBall {

	int com[] = { 0, 0, 0 };
	int num1 = 0, num2 = 0, num3 = 0;
	int strike = 0;
	int ball = 0;
	//턴횟수 변수 지정
	int turn =0;
	Scanner sc = new Scanner(System.in);

	public void start() {
		
		System.out.println("숫자 3개를 맞추면 끝나는 게임입니다");
		
		// 랜덤 수 3개 입력
		int i;
		int j;
		for (i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
		}

		// 중복여부 체크
		for (i = 0; i < com.length; i++) {
			for (j = 0; j < com.length; j++) {
				if (i == j)
					continue;
				else if (com[i] == com[j])
					com[j] = (int) (Math.random() * 9) + 1;
			}
		}
		System.out.println(com[0] +" " + com[1] + " " + com[2]);
		
		while (true) {
			
			strike = 0;
			ball = 0;
			
			System.out.print(turn + "회 숫자 3개를 입력 하세요 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
			
			// 3개가 다 맞으면 종료
			if (com[0] == num1 && com[1] == num2 && com[2] == num3) {
				break;
			}

			if (com[0] == num1) { 	strike++;	} 
			if (com[1] == num2) {	strike++;	}
			if (com[2] == num3) {	strike++;	}
			
			if (com[0] == num2 || com[0] == num3) {	ball++;	}
			if (com[1] == num1 || com[1] == num3) {	ball++;	}
			if (com[2] == num1 || com[2] == num2) {	ball++; }
			
			System.out.println("s: " + strike + " b: " + ball);

			//턴횟수 증가
			
			//턴횟수 3회이상이면 중단
			
		}

		System.out.println("게임 끝");
		sc.close();
	}
}

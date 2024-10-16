package homework.part02.baseball;

import java.util.Scanner;

public class BaseBall {

	static int num[] = { 0, 0, 0 };

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0;
		int strike = 0;
		int ball = 0;
		int i = 0;
		int j = 0;
		//턴횟수 변수 지정

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 맞추면 끝나는 게임입니다");
		
		for (i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 9) + 1;
		}

		for (i = 0; i < num.length; i++) {
			for (j = 0; j < num.length; j++) {
				if (i == j)
					continue;
				else if (num[i] == num[j])
					num[j] = (int) (Math.random() * 9) + 1;
			}
		}
		
//		System.out.println(num[0] + " " + num[1] + " " + num[2]);

		while (true) {
			System.out.print(turn + "회 숫자 3개를 입력 하세요 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
			if (num[0] == num1 && num[1] == num2 && num[2] == num3)
				break;

			if (num[0] == num1) {
				strike++;
			} 
			if (num[1] == num2) {
				strike++;
			}
			if (num[2] == num3) {
				strike++;
			}
			if (num[0] == num2 || num[0] == num3) {
				ball++;
			}
			if (num[1] == num1 || num[1] == num3) {
				ball++;
			}
			if (num[2] == num1 || num[2] == num2) {
				ball++;
			}
			System.out.println(strike + "스트라이크, " + ball + "볼");
			strike = 0;
			ball = 0;
			//턴횟수 3회이상이면 중단
			
			//턴횟수 증가
		}

		System.out.println("게임 끝");
		sc.close();
	}
}

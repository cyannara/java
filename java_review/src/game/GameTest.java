package game;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		game: while (true) {
			System.out.println("게임선택: 1.가위바위보  2.숫자맞추기  0:종료");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				new RockPaperScissors3().start();
				break;
			case 2:
				new GuessNum().start();
				break;
			case 0:
				break game;
			}
		}
		System.out.println("게임종료");
	}
}

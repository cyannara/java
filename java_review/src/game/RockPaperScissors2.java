package game;

/*
개발목적:
사용자와 컴퓨터가 가위바위보 게임을 하며 승패를 판정하고, 결과를 출력하는 프로그램을 만든다.

요구사항:
 1. 숫자 외의 값이 들어오면 "잘못된 입력입니다." 메시지를 출력하고 다시 입력을 받는다.
 2. 사용자가 0을 입력하면 프로그램이 종료된다.
 3. 승, 패, 무 횟수를 누적 저장하여 매 경기가 끝날 때마다 결과를 출력한다.
 */
import java.util.Scanner;

public class RockPaperScissors2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int win, lose, draw, user, computer ;

		//승/패/무승부 카운터 초기화
		win = 0;
		lose = 0;
		draw = 0;
		
		System.out.println("가위바위보 게임 시작!");
		
		//무한루프(0이 입력되기전까지)
		while (true) {
			
			//사용자 입력
			System.out.print("가위(1), 바위(2), 보(3), 종료(0): ");
			user  = sc.nextInt();
			
			//0이면 종료
			if (user == 0) {
				System.out.println("게임종료");
				break;
			}

			//1,2,3이 아니면 다시 입력
			if (user > 3) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			//컴퓨터의 선택 생성
			computer = (int)(Math.random()*3)+1;
			
			//사용자와 컴퓨터 선택 출력
			System.out.println("사용자:"+ user + " 컴퓨터:" + computer);

			//승패 판정 로직
			if (user == computer) {
				draw++;
				System.out.println("무승부!");
			}
			else if ((user==1 && computer==2) || (user==2 && computer==1)
					|| (user==3 && computer==2)) {
				win++;
				System.out.println("사용자 승리!");
			} else {
				lose++;
				System.out.println("컴퓨터 승리!");
			}
			
			//현재 전적 출력
			System.out.println("현재 전적:"+ win + "승 " + draw + "무 " + lose + "패");
		}
		
		//전체 결과 요약 출력
		System.out.println("최종 결과:"+ win + "승 " + draw + "무 " + lose + "패");
	}
}
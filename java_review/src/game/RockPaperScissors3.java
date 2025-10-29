package game;

/*
 * 조립식 클래스로 변경하고 코드 리펙토링 
 */
import java.util.Scanner;

public class RockPaperScissors3 {

	int win, lose, draw, user, computer;
	Scanner sc = new Scanner(System.in);

	public void start() {

		// 승/패/무승부 카운터 초기화
		win = 0;
		lose = 0;
		draw = 0;

		System.out.println("가위바위보 게임 시작!");

		// 무한루프(0이 입력되기전까지)
		while (true) {

			// 사용자 입력
			userInput2();

			// 0이면 종료
			if (user == 0) {
				System.out.println("게임종료");
				break;
			}

			// 컴퓨터의 선택 생성
			computerChoice();

			// 승패 판정 로직
			winOrLoseDecision();

			// 현재 전적 출력
			printRecord();
		}

		// 결과 출력
		printResult();
	}

	// 컴퓨터 랜덤
	void computerChoice() {
		computer = (int) (Math.random() * 3) + 1;
	}

	// 사용자 입력
	void userInput() {
		System.out.print("가위(1), 바위(2), 보(3), 종료(0): ");
		while (true) {
			try {
				user = sc.nextInt();

				// 1,2,3이 아니면 다시 입력
				if (user > 3) {
					System.out.println("잘못된 입력입니다.");
					continue;
				}

			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다.");
				sc.nextLine(); // 버퍼 비우기(입력 버퍼에 남은 데이터 때문에 무한루프나 입력 꼬임 현상이 발생함)
				continue;
			}
		}
	}

	void userInput2() {
		System.out.print("가위(1), 바위(2), 보(3), 종료(0): ");
		while (true) {
			String str = sc.nextLine();
			if (!str.matches("\\d+")) {
				System.out.println("숫자만 입력가능합니다.");
				continue;
			}
			user = Integer.parseInt(str);
			// 1,2,3이 아니면 다시 입력
			if (user > 3) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
		}
	}

	// 현재 전적 출력
	void printRecord() {
		// 사용자와 컴퓨터 선택 출력
		System.out.println("사용자:" + user + " 컴퓨터:" + computer);

		// 현재 전적 출력
		System.out.println("현재 전적:" + win + "승 " + draw + "무 " + lose + "패");
	}

	// 결과출력
	void printResult() {
		System.out.println("현재 전적:" + win + "승 " + draw + "무 " + lose + "패");
	}

	// 승패 판정 로직
	void winOrLoseDecision() {
		if (user == computer) {
			draw++;
			System.out.println("무승부!");
		} else if ((user == 1 && computer == 2) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
			win++;
			System.out.println("사용자 승리!");
		} else {
			lose++;
			System.out.println("컴퓨터 승리!");
		}
	}

	public static void main(String[] args) {
		new RockPaperScissors3().start();
	}
}
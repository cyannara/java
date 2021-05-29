package co.yedam.numgame;

import java.util.Scanner;

/*
 * 숫자맞추기 게임
 * 작성자 : 김유미
 */
public class NumberGameApp {

	int com; // 컴퓨터 만든 수
	int user; // 사용자가 입력한 값
	Scanner scanner = new Scanner(System.in);

	void init() {
		// 난수(1~10)
		com = (int) (Math.random() * 10) + 1;
	}

	// 사용자 수를 입력
	void input() {
		// scanner 를 이용해서 정수값 입력
		System.out.println("입력(1~9):");
		user = scanner.nextInt();

	}

	// 높다/낮다:false 정답:true
	boolean confirm() {
		// com과 user를 비교해서 같으면 true 리턴
		if (com == user) {
			System.out.println("정답");
			return true;
		} else if (com > user) { // 다르면 높다/낮다 출력하고 false 리턴
			System.out.println("낮음. 높은 수를 입력하세요.");
			return false;
		} else {
			System.out.println("높음. 낮은 수를 입력하세요.");
			return false;
		}
	}

	void start() {
		init();
		while (true) {
			input();
			if (confirm()) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		NumberGameApp game = new NumberGameApp();
		game.start();
	}
}

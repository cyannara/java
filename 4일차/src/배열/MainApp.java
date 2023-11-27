package 배열;

import java.util.Scanner;

public class MainApp {

	// 배열선언
	static int scores[];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//배열생성과 초기화
		init();
		int menu;
		//반복문
		do {
			System.out.println("1.전체출력 2.최솟값  3.최대값  4.평균  5.종료"); //메뉴출력
			System.out.print("선택>"); 			//메뉴입력
			menu = scan.nextInt();			
			switch(menu) {
				case 1:	//메뉴가 1이면
						printAll();	break;
				case 2:	//메뉴가 2이면
						findMin();	break;
				case 3:	//메뉴가 3이면
						findMax();	break;
				case 4:	//메뉴가 4이면
						findAvg();	break;
				case 5:	//5이면 종료
						break;
				default:	
					System.out.print("1~5 입력하세요");
			}
			//if(menu ==5 ) break;
		} while(menu != 5);
	}

	public static void init() {
		System.out.println("값입력");
		// 배열생성
		scores = new int[10]; // 모든 요소가 0으로 초기화
		// 배열초기화
		for (int i = 0; i < 10; i++) {
			scores[i] = scan.nextInt();
		}
	}

	public static void printAll() {
		// 배열값전체조회
		for (int i = 0; i < 10; i++) {
			System.out.println(scores[i]);
		}
	}

	public static void findMin() {
		// 최솟값
		int min = scores[0]; // 배열의 첫번째 값
		for (int i = 1; i < 10; i++) {
			if (min > scores[i]) { // 배열의 i번째 인덱스의 값과 min을 비교
				min = scores[i];
			}
		}
		System.out.printf("최솟값은 %d 입니다.", min);
	}

	public static void findMax() {
		// 최댓값
		int max = scores[0]; // 배열의 첫번째 값
		for (int i = 1; i < 10; i++) {
			if (max < scores[i]) { // 배열의 i번째 인덱스의 값과 min을 비교
				max = scores[i];
			}
		}
		System.out.printf("최댓값은 %d 입니다.", max);
	}

	public static void findAvg() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += scores[i];
		}
		System.out.printf("합계는 %d 입니다.", sum);
		System.out.printf("평균은 %.2f 입니다.", (double) sum / 10);
	}
}

package co.micol.classExam;

import java.util.Scanner;

public class Menu {   //캡슐화 된 Class
	private Scanner sc;
	private Car car;
	private ForTest2 forTest;
	
	public void run() {
		sc = new Scanner(System.in);
		car = new Car();
		forTest = new ForTest2();
		
		int choise;
		do {
			menuTitle();   //메뉴 제목을 호출
			System.out.println("원하는 작업번호를 선택하세요.");
			choise = sc.nextInt();
			switch (choise) {
				case 1:
					car.run();
					break;
				case 2:
					forTest.forPrint();
					break;
				case 3:
					System.out.println("종료합니다.");
					break;
			}
		}while(choise != 3);
		sc.close();
	}
	
	private void menuTitle() {
		System.out.println("1. Car");
		System.out.println("2. forTest");
		System.out.println("3. 종  료");
		System.out.println("============");
	}
}

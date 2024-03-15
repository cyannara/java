package co.micol.classExam;

import java.util.Scanner;

import co.micol.calcurator.Lotto;


public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Lotto lotto = new Lotto();
		System.out.println("금액을 입력하세요");
		int money = sc.nextInt();
		int game = money / 1000;
		int line = 1;  //출력된 라인수
		
		for(int i = 0; i < game; i++) {
			lotto.run(); //한게임 생성 후 출력
			if(line == 5) {
				System.out.println("================");
				line = 1;
			}else {
				line ++;
			}
		}
		
		sc.close();
	}

}

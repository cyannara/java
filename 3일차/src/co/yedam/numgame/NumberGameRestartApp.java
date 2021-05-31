package co.yedam.numgame;

import java.util.Scanner;

/*
 * 숫자맞추기 게임
 * 작성자 : 김유미
 */
public class NumberGameRestartApp {

	int com;     //컴퓨터 만든 수 
	int user;    //사용자가 입력한 값
	Scanner scanner = new Scanner(System.in);
	
	void init() {
		//난수(1~10)
		com = (int)(Math.random()*10)+1;
	}
	//사용자 수를 입력
	void input() {
		//scanner 를 이용해서 정수값 입력
		System.out.println("입력(1~9):");
		user = scanner.nextInt();
		
	}	
	//게임재시작여부 확인
	boolean confirmStart() {
		//scanner 를 이용해서 정수값 입력
		System.out.println("게임을 시작할까요?(y/n)");
		char re = scanner.next().charAt(0);
		if (re == 'Y'  || re == 'y' ) {  //y이면
			return true;
		} else {
			System.out.println("bye!!!! ");
			return false;
		}
	}	
	//높다/낮다:false    정답:true
	boolean confirmOver() {
		//com과 user를 비교해서 같으면 true 리턴
		if(com == user ) {
			System.out.println("정답");
			return true;
		} else if(com > user) {  //다르면 높다/낮다 출력하고 false 리턴
			System.out.println("낮음. 높은 수를 입력하세요.");
			return false;
		} else  {
			System.out.println("높음. 낮은 수를 입력하세요.");
			return false;
		}
	}
	
	void start() {
		while(true) {
			init();						//게임초기화 난수 생성
			while(true) {	
				input();				//사용자 입력
				if(confirmOver()) {		//맞으면 종료
					break;
				}
			}
			if(! confirmStart() ) {		//재시작여부 확인
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		NumberGameRestartApp game = new NumberGameRestartApp();
		game.start();
	}
}

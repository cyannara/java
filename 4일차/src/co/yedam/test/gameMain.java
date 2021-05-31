package co.yedam.test;

import java.util.Scanner;

import co.yedam.app.baseball.BaseBallApp;
import co.yedam.numgame.NumberGameApp;

public class gameMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selectNo = scanner.nextInt();
		if( selectNo == 1) {
			NumberGameApp game = new NumberGameApp();
			game.start();
		} else if(selectNo == 2) {
			BaseBallApp baseBall = new BaseBallApp();
			baseBall.start();
		}
	}
}

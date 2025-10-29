package game;

import java.util.Random;
import java.util.Scanner;

/*
 * 가위바위보 게임
 */
public class RockPaperScissors {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        String[] choices = {"가위", "바위", "보"};
	        System.out.println("가위바위보 게임 시작!");

	        while (true) {
	            System.out.print("입력 (가위/바위/보, 종료는 q): ");
	            String user = sc.next();
	            if (user.equals("q")) break;

	            String computer = choices[rand.nextInt(3)];
	            System.out.println("컴퓨터: " + computer);

	            if (user.equals(computer)) System.out.println("무승부!");
	            else if ((user.equals("가위") && computer.equals("보")) ||
	                     (user.equals("바위") && computer.equals("가위")) ||
	                     (user.equals("보") && computer.equals("바위"))) {
	                System.out.println("이겼습니다!");
	            } else {
	                System.out.println("졌습니다...");
	            }
	            System.out.println();
	        }
	    }
	}
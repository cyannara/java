package day02.제어문;

import java.util.Scanner;

/*
 * �ټ����� ������ �Է¹޾� �հ� ���
 * for��
 */
public class 성적처리{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score;
		int total = 0;
		for (int i=0;i<5; i++) {
			score = scan.nextInt();
			total = total + score;
		}
		System.out.println("total =" +  total);
	}
}

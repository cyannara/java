package 제어문;

import java.util.Scanner;

/*
 * �ټ����� ������ �Է¹޾� �հ� ���
 * while��
 */
public class 성적처리3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score;
		int total = 0;
		int i=0;
		while (i<5) {
			score = scan.nextInt();
			if(score == 0) break;
			if(score<0) continue;
			total = total + score;
			i++;
		}
		System.out.println("total =" +  total);
	}
}

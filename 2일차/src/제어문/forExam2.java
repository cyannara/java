package 제어문;

import java.util.Scanner;

/*
 * ���Ϸκ��� ���ڸ� �о�鿩 �հ� ���
 */
public class forExam2 {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int input= 1;
		int total=0;
		
	/*	for(int i=0; i<5; i++) {
			input = scan.nextInt();
			if( input == 0 ) break;
			total += input;
		}
		System.out.println(total);*/
		
/*		do {
			input = scan.nextInt();
			total += input;
		} while(input != 0 );
		System.out.println(total);*/
		
		while(input != 0) {
			input = scan.nextInt();
			total += input;
		}
		System.out.println(total);
	}
}

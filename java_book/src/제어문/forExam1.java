package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * ���Ϸκ��� ���ڸ� �о�鿩 �հ� ���
 */
public class forExam1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("./data1.txt"));
		int input;
		int total=0;
		
	/*	for(int i=0; i<10; i++) {
			if(! scan.hasNext() ) break;
			input = scan.nextInt();
			total += input;
		}
		System.out.println(total);*/
		
		while(scan.hasNext() ) {
			input = scan.nextInt();
			total += input;
		}
		System.out.println(total);
	}

}

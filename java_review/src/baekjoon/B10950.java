package baekjoon;

import java.util.Scanner;

public class B10950 {
	
	public static void main(String[] args) throws Exception {

		//파일 입력
		Scanner sc;
		sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int n1, n2;
		for(int i=0; i<cnt; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			System.out.println(n1+n2);
		}
		sc.close();
	}

}

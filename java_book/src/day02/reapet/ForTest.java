package co.micol.reapet;
/*
   Program : for test
   2021.03.15
   Micol Cho
 */
public class ForTest {

	public static void main(String[] args) {  //main method()
		// TODO For Test
		int sum = 0;
		for(int i = 1;i <= 100; i++) {  //반복 구문
			sum = sum + i;   //누적연산 방법
			System.out.print(i + " ");
		}
		
		System.out.println("누적 합 = " + sum);
	}

}

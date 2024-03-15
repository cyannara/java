package co.micol.reapet;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO do while test
		int sum = 0;
		int i = 1;
		do {
			sum = sum + i;
			i++;
			if(i > 10) break;  //조건이 참이면 Loop를 탈출한다.
			else continue;
		}while(true);
		
		System.out.println("누적 합 = " + sum);

	}

}

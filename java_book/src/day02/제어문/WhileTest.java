package day02.제어문;

public class WhileTest {

	public static void main(String[] args) {
		// TODO while test
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum = sum + i;  //sum += i;
			i++;       //sum += i++;
		}
		
		System.out.println("누적 합 = " +sum);
	}

}

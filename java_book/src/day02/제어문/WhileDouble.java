package day02.제어문;

public class WhileDouble {

	public static void main(String[] args) {
		// TODO double while
		int i = 2;
		int j;
		while(i <= 9) {
			System.out.println("===="+ i +"단 ====");
			j = 1;
			while(j <= 9) {
				System.out.println(i+" * "+j+" = " + i*j);
				j++;
			}
			i++;
		}

	}

}

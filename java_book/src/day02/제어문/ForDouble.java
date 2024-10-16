package day02.제어문;

public class ForDouble {
	public static void main(String[] args) {
		//TODO double for
		for(int i = 2; i <= 9; i++) {
			System.out.println("===="+ i +"단 ====");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i+" * "+j+" = " + i*j);
			}
		}
	}
}

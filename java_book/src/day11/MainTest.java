package day11;

public class MainTest {

	public static void main(String[] args) {
		int sum = 0;
		if(args != null) {
			for(int i=0; i<args.length; i++) {
				sum =  sum + Integer.parseInt(args[i]);
				System.out.println(args[i]);
			}
		}
		System.out.println("합계=" + sum);
	}
	
}

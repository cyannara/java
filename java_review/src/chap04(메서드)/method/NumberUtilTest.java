package method;

public class NumberUtilTest {

	public static void main(String[] args) {
		NumberUtil nu = 
			new NumberUtil();
		
		nu.sum();
		nu.sum(10,1000);
		
		int c = nu.sumRe(1,2);
		System.out.println(nu.sumRe(1,2));
	}
}

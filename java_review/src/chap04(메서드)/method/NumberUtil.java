package method;

public class NumberUtil {
	public void sum() {
		int a = 10;
		int b = 20;
		int result = 0;
		result = a + b;
		System.out.println(result);
	}
	
	public void sum(int a, int b) {
		int result = 0;
		result = a + b;
		System.out.println(result);
	}
	
	public int sumRe(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
}

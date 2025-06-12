package day06.method;

public class MyCalculator {
	
	private int num1;
	private int num2;
	private int result;

	//public MyCalculator() {}
	public MyCalculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		sum() ;
	}
	
	private void sum() {
		result = num1 + num2;
	}

	public int getResult() {
		return result;
	}
	
}

package method;

public class ArrayUtil {
	public int sum(int[] score) {
		int result =0;
		for(int i=0; i< score.length; i++) {
			result += score[i];
		} 
		return result;	
	}
	
	public double avg(int a, int b, int c) {
		return (a+b+c)/3;
	}
}

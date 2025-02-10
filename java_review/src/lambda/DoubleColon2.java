package lambda;

import java.util.Arrays;
import java.util.List;

public class DoubleColon2 {

	public static void staticFunction(String str) {
		System.out.print(str+",");
	}
	
	public void someFunction(String str) {
		System.out.print(str+",");
	}

	public static void main(String[] args) {
		
		List<String> fruit = Arrays.asList("사과", "바나나", "포도");
		
		
		fruit.forEach(new DoubleColon2()::someFunction);
		System.out.println();
		
		fruit.forEach(DoubleColon2::staticFunction);
	}

}

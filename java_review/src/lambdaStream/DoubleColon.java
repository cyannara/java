package lambdaStream;
/*
 * lambda with method reference
 * 
 * 메소드 참조(::) 더블콜론
 * 람다식에서 파라미터를 중복해서 사용하고 싶지 않을 때 사용
 * 클래스를 직접 사용하고 메소드를 참조
 * [인스턴스]::[메서드명]
 * static 인경우 인스턴스 대신 클래스 이름으로 사용
 */

import java.util.Arrays;
import java.util.List;

public class DoubleColon {

	public static void main(String[] args) {
		List<String> fruit = Arrays.asList("사과", "바나나", "포도");
		
//		for(int i=0; i<fruit.size(); i++) {
//			System.out.println(fruit.get(i));
//		}
		
		//fruit.forEach(s -> System.out.println(s));
		
		fruit.forEach(System.out::println);
	}
}

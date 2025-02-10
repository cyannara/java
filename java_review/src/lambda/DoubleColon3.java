package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleColon3 {
	public static void main(String[] args) {
		List<String> testList = Arrays.asList("one", "two", "three", "four");
		
		testList = testList.stream()
				//.map(a -> a.toUpperCase()) // 람다 표현식
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		testList.forEach(System.out::println);
	}
}

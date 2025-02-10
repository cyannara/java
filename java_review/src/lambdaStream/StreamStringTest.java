package lambdaStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStringTest {

	public static void main(String[] args) {
		
		String[] strArr = {"키위","포도","바나나","사과","감","사과"};
		
		long cnt = Stream.of(strArr)  // 문자열배열이 소스인 스트림
				 .filter(s -> s.length()>1)        // 걸러내기(중간연산)
				.distinct()                        // 중복 제거(중간연산)     
				.count();                          // 요소 개수(최종연산)  
		System.out.println(cnt);
				
		
		List<String> list = Stream.of(strArr)  // 문자열배열이 소스인 스트림
				 .filter(s -> s.length()>1)        // 걸러내기(중간연산)
				.distinct()                        // 중복 제거(중간연산)     
				.sorted()                          // 정렬(중간연산)
				.limit(2)                          // 스트림 자르기(중간연산)  
				.collect(Collectors.toList());     // list로 변환(최종연산)
		System.out.println(list);

		Stream.of(strArr)  // 문자열배열이 소스인 스트림
		 .filter(s -> s.length()>1)        // 걸러내기(중간연산)
		.distinct()                        // 중복 제거(중간연산)     
		.sorted()                          // 정렬(중간연산)
		.limit(2)                          // 스트림 자르기(중간연산)  
		.forEach(System.out::println);     // 반복문 출력(최종연산)
		
	}
}

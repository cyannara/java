package lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/*
 * 명령형(절자지향형 -> 객체지향형)  -> 선언형(함수형, 논리형)
 */
public class Paradigm {

	@Test
	public void test() {
		String[] fruit = {"키위","포도","바나나","사과","감","사과"};
		
		//명령형 : 객체지향형
		List<String> result = new ArrayList<>();
		for(int i=0; i<fruit.length; i++ ) {
			if(fruit[i].length()>1) {
				result.add(fruit[i]);
			}
		}
		
		//선언형 : 함수형
		List<String> result2 = Stream.of(fruit)  //스트링 생성
			      .filter(s -> s.length()>1)
			      .toList();
	}
}

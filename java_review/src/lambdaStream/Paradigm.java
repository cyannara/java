package lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/*
 * 명령형(절자지향형 -> 객체지향형)  -> 선언형(함수형, 논리형)
 명령형 : 프로그램의 상태를 변경하는 명령어(Statement)들의 순차적인 실행을 통해 동작하는 방식.
 선언형 : 프로그램이 "어떻게" 실행되는지보다 "무엇을" 해야 하는지를 기술하는 방식.
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

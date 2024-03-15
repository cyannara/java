package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyTest {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","김유신","나기자","을지문덕");
		System.out.println(list);
		
		//생성자형식으로 복사
		List<String> dest  = new ArrayList<>(list);
		System.out.println(dest);
		
		//copy 메서드
		Collections.sort(list);
		System.out.println("정렬: " + list);
		Collections.reverse(list);
		System.out.println("역순: " + list);
		Collections.shuffle(list);
		System.out.println("섞기: " + list);
			
		//Collections.copy(dest, list); //원본의 요소 갯수만큼 복사본 리스트에도  생성
		//System.out.println(dest);
		
	
	}

}

package co.list.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyList {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","김유신","나기자","을지문덕");
		System.out.println(list);
		
		//생성자형식으로 복사
		List<String> dest  = new ArrayList<>(list);
		System.out.println(dest);
		
		//copy 메서드
		//원본의 요소 갯수만큼 복사본 리스트에도  생성
		Collections.copy(dest, list); 
		System.out.println(dest);
	
		//정렬
		Collections.sort(list);
		System.out.println("정렬: " + list);
		//역순
		Collections.reverse(list);
		System.out.println("역순: " + list);
		//섞기
		Collections.shuffle(list);
		System.out.println("섞기: " + list);
			
		
	
	}

}

package day09.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic Type
 * @since 1.5
 * 1. 제네릭은 타입을 제한하여 원치 않는 타입의 값이 들어가는 경우엔 컴파일에러를 발생하고
 * 2. 값을 꺼내올때는 자동으로 형변환을 처리해주어 반복적인 형체크, 형변환 코드를 없애주는 역할
 * 3. 콜렉션, 람다, 스트림, NIO에서 많이 사용.
 */
public class GenericTestMain {
	public static void main(String[] args) {
		
		//1. generic 타입을 사용하지 않은 경우
		List list1 = new ArrayList();
		
		list1.add(5400);
		Integer p1 = (Integer)list1.get(0);			//타입변환 필요함. 
		
		list1.add("no use Generic type");
		Integer p2 = (Integer)list1.get(0);			//실행 시 타입변환 에러 발생		 
		
			
		//2. generic 타입을 사용한 경우
		List<Integer> list2 = new ArrayList<>();
		
		//Integer을 저장하고 Integer로 읽기
		list2.add(500);
		Integer p3 = list2.get(0);						//타입변환 필요없음. 
		
		//list2.add("use generic type");				//컴파일 시 타입 체크 에러 발생		
		//Integer p4 = list2.get(0);
		
	}
}


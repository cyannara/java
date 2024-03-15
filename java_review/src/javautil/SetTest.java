package javautil;
/**
 * Set  : 중복값 허용 안함, 순서 없음 
 */
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		//추가
		set.add("바나나");
		set.add("사과");
		set.add("메론");
		set.add("바나나");
		
		//삭제
		set.remove("메론");
		
		//조회   -> 인덱스가 없어서 단건 조회 안됨
		
		//전체조회 -> 순서가 없기 때문에 iterator화 시켜서 순서를 지정하고 읽어냄
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println( iter.next() );
		}
	}
}

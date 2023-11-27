package collection;

import java.util.HashSet;

/** 
 * set을 이용해서 중복제거
 * @author user
 *
 */
public class SetDuplicateTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String[] names = {"철수","영희","철수","문덕","유신"};
		
		HashSet<String> set = new HashSet<String>();
		//names 배열을 set 객체 담기
		for(int i=0; i<names.length; i++ ) {
			set.add(names[i]);
		}
		//set 객체출력
		System.out.println(set);
	}

}

package collections;

/**
 * 스트링 리스트 정렬하기 
 * 
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * List 정렬하기
 * @author user
 *
 */
public class ListOrderString {

	
	public static void main(String[] args) {
		
		//스트링 정렬
		ArrayList<String> list = new ArrayList<String>();
		//추가
		list.add("사과");
		list.add("키위");
		list.add("딸기");
		
		Collections.sort(list);		
		for(String temp : list) {
			System.out.println(temp);
		}
		
	}
}


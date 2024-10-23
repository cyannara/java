package day09.collection;

import java.util.ArrayList;

/**
 * 
 * @author user
 * 스트링타입의 리스트(숫자) 의 합
 *
 */
public class ListExam1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("100");
		list.add("50");
		list.add("10");
	
		//전체출력
		
		//합계계산 출력 
		for(String f : list ) {
			System.out.println(f);
		}
	}
}

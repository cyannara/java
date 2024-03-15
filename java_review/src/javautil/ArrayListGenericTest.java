package javautil;

import java.util.ArrayList;

/**
 * 제네릭 형식으로 리스트 이용하기
 * @author user
 *
 */
public class ArrayListGenericTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		
		String temp  =  list.get(0);
		
		for(String f : list ) {
			System.out.println(f.length());
		}
		
	}

}

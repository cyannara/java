package javautil;

import java.util.ArrayList;

/**
 * ���׸� �������� ����Ʈ �̿��ϱ�
 * @author user
 *
 */
public class ArrayListGenericTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("�ٳ���");
		
		String temp  =  list.get(0);
		
		for(String f : list ) {
			System.out.println(f.length());
		}
		
	}

}

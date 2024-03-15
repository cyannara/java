package javautil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArraylistTest {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		//1. �߰�
		//list.addFirst(e);   //linked ���� ����
		list.add("�ٳ���");
		list.add("���ξ���");
		list.add("���");     // �߰�
		
		list.add(1,"�޷�");   // ����
		list.set(0,"����");   // ����
		System.out.println(list);
		
		//2. ����
		//list.removeFirst();  //linked ���� ����
		//list.remove(1);      // ����
		//list.remove("���");
		System.out.println(list);
		
		//3. �˻�
		System.out.println("ù��° ������ " + list.get(0) );
		
		//4. ��ü��ȸ
		for(int i=0; i<list.size(); i++) {
			String temp = (String)list.get(i);
			System.out.println(temp);
		}
		
		for( Object  f : list  ) {
			System.out.println( ( (String)f).length() );  // �� ����� ���ڿ� ���� 
		}
		
		//5. ����, ����
		Collections.sort(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}

}

package collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author ������
 * ArrayList ����(�߰�/����/����/����/��ȸ/��ü��ȸ)
 *
 */
public class ArrayListTest {
	public static void main(String[] args) {
		
		//��ü ����
		LinkedList<String> list = new LinkedList<String>();
		
		//�߰�
		list.add("�ٳ���");
		list.add("�ٳ���");
		list.add("���");
		list.add("�޷�");  //�߰�
		list.add(0,"����");//����
		
		System.out.println(list);
		
		//����
/*		list.remove(0);
		list.remove("�޷�");
		System.out.println(list); */
		
		//����
		list.set(0, "����");
		System.out.println(list);
		
		//��ȸ
		System.out.println( "ù��° ������: " + list.get(0) );
		
		//��ü��ȸ - for
		for(int i=0; i< list.size() ; i++ ) {
			System.out.println(i +" : " + list.get(i));
		}
		
		
		//��ü��ȸ - Ȯ�� for
		int cnt = 0;
		for( String temp : list ) {
			System.out.println(cnt + " : " + temp);
			cnt++;
		}
		
		//��ü��ȸ iterator(�ݺ���)
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println( iter.next() );
		}
		
	}
}










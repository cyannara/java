package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author USER
 * Set ���� : �߰�/����/��ȸ
 * �ߺ������ ���� / ���� ����
 */
public class SetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		//�߰�
		names.add("�ٳ���");
		names.add("�ٳ���");
		names.add("���");
		
		System.out.println(names);
		
		//��ü��ȸ
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			System.out.println( iter.next() );
		}
		
		//����
		names.remove("���");
		System.out.println(names);
	
		
		
	}

}














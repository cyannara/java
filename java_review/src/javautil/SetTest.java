package javautil;
/**
 * Set  : �ߺ��� ��� ����, ���� ���� 
 */
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		//�߰�
		set.add("�ٳ���");
		set.add("���");
		set.add("�޷�");
		set.add("�ٳ���");
		
		//����
		set.remove("�޷�");
		
		//��ȸ   -> �ε����� ��� �ܰ� ��ȸ �ȵ�
		
		//��ü��ȸ -> ������ ���� ������ iteratorȭ ���Ѽ� ������ �����ϰ� �о
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println( iter.next() );
		}
	}
}

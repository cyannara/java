package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author USER
 * Map ����(�߰�/����/����/����/��ȸ/��ü��ȸ)
 * ��ȸ ���� / key �� value ������ ����
 */
public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		//�߰�
		map.put("101", "ȫ�浿");
		map.put("102", "��������");
		map.put("103", "������");
		
		System.out.println(map);
		
		//����
		map.remove("101");
		System.out.println(map);
		
		//����
		map.put("102", "�̼���");  
		System.out.println(map);
		
		//��ȸ
		System.out.println("103�� :" + map.get("103"));
		
		//��ü��ȸ
		Set<String> keys = map.keySet();  //Ű ��ü�� ���
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String name = map.get(key);
			System.out.println(key + " : " + name);
		}
	}
}













package javautil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Map
 *  key �� ���ؼ� ����, �а�, ����
 *  �˻�
 */
public class MapTest {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1","���");
		map.put("2","��");
		map.put("3","�޷�");
		
		map.put("1","�ٳ���");  // Ű �ߺ� �ȵ�. ������ ��		
		System.out.println(map);
		
		//����
		map.remove("2");  // Ű(key) �� ����
		
		//��ȸ(�˻�)  
		System.out.println(map.get("3"));
		
		//��ü��ȸ
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}
	}

}

package javautil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  List�� Map�� ���� 
 *
 */
public class ListMapTest {

	public static void main(String[] args) {

		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
	
		Map<String, String> map = new HashMap<String, String>();
		//ù��° ���
		map.put("name", "ȫ�浿");
		map.put("salary", "1000");
		map.put("deaprtment", "�ѹ�");
		list.add(map);
		
		map = new HashMap<String, String>();
		//�ι�° ���
		map.put("name", "�̼���");
		map.put("salary", "2000");
		map.put("deaprtment", "�λ�");
		list.add(map);
		
		System.out.println(list);
		//�̸��� ���
		for(Map<String, String> temp : list ) {
			System.out.println(temp.get("name"));
		}
		
		for(int i=0; i<list.size(); i++) {
			Map<String, String> temp = list.get(i);
			String name = temp.get("name");
			
			String name2 = list.get(i).get("name");
			System.out.println(name2);
		}
		//��ü �޿� ���
		
	}

}

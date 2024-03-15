package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author USER
 * List
 */
public class ListMapTest {

	public static void main(String[] args) {
		List<Map<String,String>> list = 
				new ArrayList<Map<String,String>>( );
		
		
		//추가
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "홍길동");
		map.put("sal", "2000");
		list.add(map);
		
		map = new HashMap<String,String>();
		map.put("name", "김유신");
		map.put("sal", "1500");
		list.add(map);
		
		map = new HashMap<String,String>();
		map.put("name", "을지문덕");
		map.put("sal", "2500");
		list.add(map);
		
		System.out.println(list);
		
		//급여합계
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += Integer.parseInt(list.get(i).get("sal"));
		}
		System.out.println(sum);
	}

}














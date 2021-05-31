package dept;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author User
 * List안에 Map 객체 담기 
 */
public class MapList {

	public static void main(String[] args) {
		
		ArrayList<HashMap<String,Object>> list =
				new ArrayList<HashMap<String,Object>>();
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("departmentId", "10");
		map.put("departmentName", "총무");
		map.put("managerId", "100");
		map.put("locationId", "1000");
		list.add(map);
		
		map = new HashMap<String,Object>();
		map.put("departmentId", "20");
		map.put("departmentName", "인사");
		map.put("managerId", "200");
		map.put("locationId", "2000");
		list.add(map);
		
		map = new HashMap<String,Object>();
		map.put("departmentId", "30");
		map.put("departmentName", "기획");
		map.put("managerId", "300");
		map.put("locationId", "3000");
		list.add(map);	
		
		System.out.println(list);
		
		//두번째 부서의 부서명을 출력
		System.out.println(list.get(1).get("departmentName"));
		
	}
}




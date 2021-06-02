package co.api.util;

import java.util.HashMap;

public class MapUtil {
	HashMap<Integer, Emp> map;
	
	public MapUtil() {
		map = new HashMap<>();
	}
	
	//추가
	public void addEmp(Emp emp) {
		map.put(emp.id, emp);
	}
	//수정
	public void updEmp(Emp emp) {
		map.put(emp.id, emp);
	}
	//삭제
	public void delEmp(Integer id) {
		//remove
	}	
	//사번으로 이름 조회
	public String getName(Integer id) {
		//get
		return "";
	}	
	//맵 리턴
	public HashMap<Integer, Emp> getMap(){
		return map;
	}
	//전체이름만조회  map.keySet()  -->   Iterator  -> for
}

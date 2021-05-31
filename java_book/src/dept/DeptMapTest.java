package dept;

import java.util.HashMap;

public class DeptMapTest {

	public static void main(String[] args) {

		HashMap<String, DeptBeans> map = new HashMap<String, DeptBeans>();
		//키는 중복안됨. 테이블의 기본키를 이용
		map.put("10", new DeptBeans("1000", "100", "총무", "10"));
		map.put("20", new DeptBeans("1000", "100", "인사", "20"));
		map.put("30", new DeptBeans("1000", "100", "기획", "30"));
		
		//20번 부서의 부서명을 출력
		System.out.println(map.get("20").getDepartmentName());
	}

}

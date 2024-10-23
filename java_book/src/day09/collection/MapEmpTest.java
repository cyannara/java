package day09.collection;

import java.util.HashMap;
import java.util.Set;

/**
 * (Emp)객체를 저장하는 Map 구조 
 *
 */
public class MapEmpTest {

	public static void main(String[] args) {

		HashMap<Integer, Employees> map = new HashMap<Integer, Employees>();
		map.put(101, new Employees("101","길동","홍",2000));
		map.put(102, new Employees("102","문덕","을지",2400));
		map.put(103, new Employees("103","유신","김",3000));
		
		//1. 102번 사원의 급여는?
		System.out.println(map.get(102).getSalary());
		
		//2. 급여만 모두 출력
		Set<Integer> keys  =  map.keySet();
		for(Integer key : keys) {
			System.out.println(key + " : " + map.get(key).getSalary());
		}
	}

}

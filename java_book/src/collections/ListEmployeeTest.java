package collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author user
 * List 의 요소 타입이 객체인 경우(사원정보)
 */
public class ListEmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
		list.add(new Employees("100","길동","홍","2000"));
		list.add(new Employees("101","유신","김","2500"));
		list.add(0, new Employees("102","문덕","을지","3000"));
		
		//일반for 전체조회 (salary) ->  급여합계
		Employees emp = null;
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			emp = list.get(i);
			System.out.println(emp.getSalary());
			sum += Integer.parseInt(emp.getSalary());
		}
		System.out.println("합계= " + sum );
		
		//확장for문 - 이름만 출력
		System.out.println("확장for문================");
		for(Employees temp : list) {
			System.out.println(temp.getFirst_name());
		}
		
		//iterator - last_name
		System.out.println("iterator===============");
		Iterator<Employees> iter = list.iterator();
		while(iter.hasNext()) {
			emp = iter.next();
			System.out.println(emp.getLast_name());
		}
		
	}
}


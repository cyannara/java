package dept;

import java.util.ArrayList;
import java.util.Iterator;

public class DeptListTest {

	public static void main(String[] args) {
		
		ArrayList<DeptBeans> list = new ArrayList<DeptBeans>();
		list.add(new DeptBeans("1000", "100","미래전략실","300"));
		list.add(new DeptBeans("1000", "100","총무","400"));
		list.add(new DeptBeans("1000", "100","인사","500"));
		list.add(new DeptBeans("1000", "100","기획","600"));
		
		//일반 for문 전체조회하여 부서명만 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getDepartmentName());
		}
		System.out.println("=========================");
		
		//확장for문 이용하여 부서명만 출력
		for(DeptBeans dept  : list   ) {
			System.out.println(dept.getDepartmentName());
		}		
		System.out.println("=========================");
		
		//iterator 이용하여 부서명만 출력
		Iterator<DeptBeans> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().getDepartmentName());
		}
	}
}

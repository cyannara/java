package day09.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import day09.collection.Employees;
import day09.collection.Employees;

class EmpComp implements Comparator<Employees>{
	public int compare(Employees o1, Employees o2) {
		return o1.getFirst_name().compareTo(o2.getFirst_name());
	}
}

//급여순으로 비교
class  EmpSalComp implements Comparator<Employees>{
	public int compare(Employees o1, Employees o2) {
		return o1.getSalary()-o2.getSalary();
	}	
}

public class EmpSortTest {
	public static void main(String[] args) {
		List<Employees> empList = new ArrayList<Employees>();
		empList.add(new Employees("101","길동","홍",2000));
		empList.add(new Employees("102","기자","나",2200));
		empList.add(new Employees("103","문덕","을지",1000));
		empList.add(new Employees("104","유신","김",1500));
		System.out.println(empList);
		
		//정렬
		EmpComp empcomp = new EmpComp();		
		Collections.sort(empList,empcomp); //급여순으로 정렬
		System.out.println(empList);
		
		//익명클래스
		Collections.sort(empList, new Comparator<Employees>(){	
			public int compare(Employees o1, Employees o2) {
				return o1.getSalary() - o2.getSalary();
			}
		});
		
		//람다식 
		Collections.sort(empList, (Employees o1, Employees o2) ->{
				return o1.getSalary() - o2.getSalary();
		});
		
		//검색
		int idx = Collections.binarySearch(empList, 
										new Employees("101","유신","홍",2000), 
										empcomp);
		System.out.println("검색결과:"+ idx);
	}
}

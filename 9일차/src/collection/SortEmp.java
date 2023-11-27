package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 리스트 정렬
 */
class EmpComp implements Comparator<EmpVO>{
	public int compare(EmpVO o1, EmpVO o2) {
		return o1.getFirst_name().compareTo(o2.getFirst_name());
	}
}

//급여순으로 비교
class  EmpSalComp implements Comparator<EmpVO>{
	public int compare(EmpVO o1, EmpVO o2) {
		return o1.getSalary()-o2.getSalary();
	}	
}

public class SortEmp {
	public static void main(String[] args) {
		List<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO("101","길동","홍",2000));
		list.add(new EmpVO("102","기자","나",2200));
		list.add(new EmpVO("103","문덕","을지",1000));
		list.add(new EmpVO("104","유신","김",1500));
		
		EmpComp empcomp = new EmpComp();
		
		System.out.println(list);
		Collections.sort(list,empcomp); //급여순으로 정렬(무명(익명) 클래스)
		System.out.println(list);
		
		int idx = Collections.binarySearch(list, 
										new EmpVO("101","유신","홍",2000), 
										empcomp);
		System.out.println("검색결과:"+ idx);
	}
}

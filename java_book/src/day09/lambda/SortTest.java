package day09.lambda;

import java.util.ArrayList;
import java.util.Collections;

import day09.collection.Employees;


public class SortTest {
	public static void main(String[] args) {
		ArrayList<Employees> emplist = new ArrayList<>();
		emplist.add(new Employees("1","홍길동","인사"));
		emplist.add(new Employees("2","김기자","기획"));
		emplist.add(new Employees("3","김유신","회계"));
		
		Collections.sort(emplist, (Employees o1, Employees o2) -> 
				 o1.getDepartment_id().compareTo(o2.getDepartment_id())
			);
		System.out.println(emplist);
	}
}
/*
class EmpCompare implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		//return o1.getName().compareTo(o2.getName());
		return o1.getDept().compareTo(o2.getDept());
	}
}
*/
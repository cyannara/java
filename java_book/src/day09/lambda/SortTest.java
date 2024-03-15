package day09.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import day09.util.Emp;

public class SortTest {
	public static void main(String[] args) {
		ArrayList<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(1,"홍길동","인사"));
		emplist.add(new Emp(2,"김기자","기획"));
		emplist.add(new Emp(3,"김유신","회계"));
		
		Collections.sort(emplist, (Emp o1, Emp o2) -> 
				 o1.getDept().compareTo(o2.getDept())
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
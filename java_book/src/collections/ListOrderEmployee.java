package collections;

/**
 * 정렬하기 
 * 1. Comparable 인터페이스 구현
 * 2. Comparator 인터페이스 이용(익명클래스)
 * 
 * static 네스티드 클래스
 * inner 클래스 
 *     - 맴버클래스
 *     - 로컬클래스
 *     - 익명클래스
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * List 정렬하기
 * @author user
 *
 */
public class ListOrderEmployee {

	public static void main(String[] args) {
		
		//Employee 리스트를  first-name으로 정렬
		ArrayList<Employees> empList = new ArrayList<Employees>();
		empList.add(new Employees("101","길동","홍","4000"));
		empList.add(new Employees("102","유신","김","2500"));
		empList.add(new Employees("103","문덕","을지","3000"));
		
		Collections.sort(empList);		
		for(Employees temp : empList) {
			System.out.println(temp.getEmployee_id() +":" + 
							   temp.getFirst_name() + ":"+ 
							   temp.getSalary());
		}
		System.out.println("====정렬후======");
		
		//Employee 리스트를 salary로 정렬
		Collections.sort(empList, new SalaryComparator());  					//클래스
//		Collections.sort(empList, ListOrderEmployee.getComparator());				//로컬클래스
//		Collections.sort(empList, new ListOrderEmployee().new MemberComparator());//맴버클래스
/*		Collections.sort(empList, new Comparator<Employees>(){					//익명클래스
			public int compare(Employees o1, Employees o2) {
				return Integer.parseInt(o1.getSalary()) - Integer.parseInt(o2.getSalary());
			}}
		);*/
		for(Employees temp : empList) {
			System.out.println(temp.getEmployee_id() +":" + temp.getSalary());
		}
	}
	
	public static Comparator getComparator() {
		//로컬 클래스
		class LocalComparator implements Comparator<Employees>{
			@Override
			public int compare(Employees o1, Employees o2) {
				return Integer.parseInt(o1.getSalary()) - Integer.parseInt(o2.getSalary());
			}
		}
		return new LocalComparator();
	}
	
	//맴버클래스
	class MemberComparator implements Comparator<Employees>{
		@Override
		public int compare(Employees o1, Employees o2) {
			return Integer.parseInt(o1.getSalary()) - Integer.parseInt(o2.getSalary());
		}
	}
}

//클래스
class SalaryComparator implements Comparator<Employees>{
	@Override
	public int compare(Employees o1, Employees o2) {
		return Integer.parseInt(o1.getSalary()) - Integer.parseInt(o2.getSalary());
	}
}




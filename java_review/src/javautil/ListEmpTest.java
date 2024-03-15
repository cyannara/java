package javautil;

import java.util.ArrayList;

/**
 * 사원정보 저장
 * @author user
 *
 */
public class ListEmpTest {

	public static void main(String[] args) {
		
		ArrayList<Emp> list = new  ArrayList<Emp>();
		//사원 추가
		Emp e = new Emp();
		e.setFirstName("유미");
		e.setLastName("김");
		e.setSalary(2000);
		list.add(e);
		
		list.add(new Emp("길동", "홍", 4000));
		
		System.out.println(list);
		
		//사원이름(firstName)만 출력
		for(Emp f : list ) {
			System.out.println(f.getFirstName());
		}
	}
}

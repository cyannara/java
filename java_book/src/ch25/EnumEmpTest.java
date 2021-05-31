package ch25;

import java.util.ArrayList;
import java.util.List;

public class EnumEmpTest {
	public static void main(String[] args) {
		List<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO("101",Gender.MALE));
		list.add(new EmpVO("102",Gender.FEMALE));
		list.add(new EmpVO("103",Gender.MALE));
		list.add(new EmpVO("104",Gender.FEMALE));
		
		//남자가 몇명인지 카운터
		int cnt = 0;
		for(EmpVO vo : list) {
			if( vo.getGen() == Gender.MALE ) {
				cnt ++;
			}
		}
		System.out.println("남자:" + cnt);
	}
}

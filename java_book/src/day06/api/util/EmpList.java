package day06.api.util;

import java.util.ArrayList;

public class EmpList {
	ArrayList<Emp> list;
	
	public EmpList() {
		list = new ArrayList<>();
	}
	//추가
	public void addEmp(Emp emp) {
		list.add(emp);
	}
	//해당사원 이름조회
	public String getName(int index) {
		String name = "";
		//to do	
		name = list.get(index).name;
		return name;
	}	
	//삭제
	public void delEmp(int index) {
	}
	
	//전체 이름만 출력
	public void getNames() {
		for(Emp e : list )
			System.out.println(e.name);
	}
	
	//전체 이름만 리턴
	public String getNameStr() {
		String names = "";
		//for()
		
		return names;
	}
	//list 조회
	public ArrayList<Emp> getList() {
		return list;
	}
}



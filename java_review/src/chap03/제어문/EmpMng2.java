package chap03.제어문;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmpMng2 {
	
	List<EmpVO> emps = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		EmpMng2 empMng = new EmpMng2();
		empMng.input();
		empMng.list();
	}
	
	public void input() throws Exception {
		Scanner sc;
		File file = new File("src/resources/emp.txt");
		sc = new Scanner(file);
		String str;
		EmpVO emp;
		while(sc.hasNext()) {
			str = sc.nextLine();
			String[] arr = str.split(",");
			System.out.println(arr[0]);
			System.out.println(arr[7]);
			emp = new EmpVO();
			emp.setEmployee_id(arr[0]);
			emp.setFirst_name(arr[1]);
			emp.setSalary(Integer.parseInt(arr[7]));
			emps.add(emp);
			System.out.println();
		}
		sc.close();
	}
	public void list() {
		for(EmpVO emp : emps) {
			System.out.println(emp);
		}
	}
}

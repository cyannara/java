package co.yedam.emp;

import java.util.Scanner;

public class EmployeeApp {
	Employee[] arr;
	int empNum;
	Scanner scanner = new Scanner(System.in);
	
	void init() {
		System.out.print("사원수 입력>");
		empNum = scanner.nextInt();
		arr = new Employee[empNum];
	}
	
	void input() {		
		for(int i=0;i<arr.length; i++) {
			System.out.printf("%d 사번>",i);
			int no = scanner.nextInt();
			System.out.print("이름>");
			String name = scanner.next();
			System.out.print("급여>");
			int sal = scanner.nextInt();
			arr[i] = new Employee(no,name, sal); 
		}
	}
	//검색
	String search(int employeeId) {
		String name = "";
		for(int i=0;i<arr.length; i++) {
			if(employeeId == arr[i].employeeId) {
				name = arr[i].name;				
			}
		}
		return name;
	}
	
	//전체사원출력
	void print() {
		for(int i=0;i<arr.length; i++) {
			System.out.printf("%-5d %10s %-7d\n", arr[i].departmentId, arr[i].name, arr[i].salary);
		}
	}
	
	//급여합게
	int sum() {
		int result = 0;
		for(int i=0;i<arr.length; i++) {
			result += arr[i].salary;
		}
		return result;
	 }
}

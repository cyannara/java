package chap03.제어문;

import java.io.File;
import java.net.URI;
import java.util.Scanner;

public class EmpMng {
	
	
	public static void main(String[] args) throws Exception {
		EmpMng empMng = new EmpMng();
		empMng.input();
		empMng.list();
	}
	
	public void input() throws Exception {
		Scanner sc;
		URI uri = EmpMng.class.getResource("/resources/emp.txt").toURI();  //상대경로
		File file = new File(uri);
		sc = new Scanner(file);
		//sc.useDelimiter(",");
		String str;
		while(sc.hasNext()) {
			str = sc.next();
			String[] emp = str.split(",");
			for(String value: emp) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
	public void list() {
		
	}
}

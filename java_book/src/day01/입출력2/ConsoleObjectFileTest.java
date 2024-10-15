package day01.입출력2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javautil.Emp;

/**
 * 사원정보를 콘솔로 입력받아서 Object 형태로 파일에 저장
 *
 */
public class ConsoleObjectFileTest {

	public static void main(String[] args) throws Exception {

		// 입력변수 선언
		String fname;
		long salary;

		// Scanner 입력
		Scanner scan = new Scanner(System.in);
		fname = scan.next();
		salary = scan.nextLong();

		// Emp 객체를 생성해서 File 에 저장 ( emp.txt )
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/emp.dat"));
		out.writeObject(new Emp(fname, null, salary));
		out.close();

		// 읽기
		FileInputStream fi = new FileInputStream("d:/emp.dat");
		ObjectInputStream in = new ObjectInputStream(fi);
		while (fi.available() > 0) {
			Emp emp1 = (Emp) in.readObject(); // EOFexception
			System.out.println(emp1);
		}
		in.close();
	}

}

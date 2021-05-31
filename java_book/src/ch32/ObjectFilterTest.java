package ch32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ch25.EmpVO;

/*
 * 인스턴스(객체) 읽고 쓰기
 */
public class ObjectFilterTest {

	public static void main(String[] args) throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(
							new BufferedOutputStream(
							new FileOutputStream("d:/upload/emp.dat")));
		
		EmpVO emp = new EmpVO("100","길동","홍",2000);
		oos.writeObject(emp);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
				new FileInputStream("d:/upload/emp.dat")));
		EmpVO result = (EmpVO)ois.readObject();
		System.out.println(result);
		ois.close();
	}

}










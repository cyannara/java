package 입출력;

import java.io.*;

import javautil.Emp;

/**
 * 객체(인스턴스) 를 통째로 저장하고 읽기 
 */
public class ObjectFilterTest {

	public static void main(String[] args) throws Exception {
/*		//저장
		ObjectOutputStream out = 
		new ObjectOutputStream(new FileOutputStream("d:/object.dat"));
		
		//키보드입력
		
		out.writeObject(new Emp("길동","홍",2000));
		out.writeObject(new Emp("순신","이",1000));
		
		out.close();*/
		
		//읽기
		FileInputStream fi = new FileInputStream("d:/object.dat");
		ObjectInputStream in = new ObjectInputStream(fi);
		while(fi.available() > 0){		
			Emp emp1 = (Emp)in.readObject();   //EOFexception
			System.out.println(emp1);
		}
		in.close();		
	}
}

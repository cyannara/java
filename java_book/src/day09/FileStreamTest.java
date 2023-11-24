package day09;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 파일 입출력 
 */
public class FileStreamTest {

	public static void main(String[] args) throws Exception {

		//파일에 쓰기
		FileOutputStream fos = new FileOutputStream("d:/upload/data.dat");
		fos.write(7);
		fos.close();
		
		//파일 읽기
		FileInputStream fis = new FileInputStream("d:/upload/data.dat");
		int a = fis.read();
		System.out.println(a);
		fis.close();
		
		
	}

}

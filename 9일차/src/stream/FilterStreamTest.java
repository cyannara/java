package stream;

import java.io.*;

/*
 * 입력데이터를 조합, 가공(필터)
 */
public class FilterStreamTest {

	public static void main(String[] args) throws Exception {

		//1. DataType별로 읽고 쓰기
		FileOutputStream fos = new FileOutputStream("d:/upload/dataType.dat");
		DataOutputStream dos = 
				new DataOutputStream(new BufferedOutputStream(fos));
		
		dos.writeInt(100);
		dos.writeChar('a');
		dos.writeChars("hello");
		
		dos.close();
		fos.close();
			
		//FileInputStream fis = new FileInputStream("d:/upload/dataType.dat");
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(
				    new FileInputStream("d:/upload/dataType.dat")));
		
		int a = dis.readInt();
		char b = dis.readChar();
		String c = dis.readLine();
		System.out.println(a + " : " + b + " : " + c);
	
	}
}


















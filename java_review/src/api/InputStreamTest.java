package api;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputStreamTest {

	//@Test
	@DisplayName("키보드 입력을 파일로 저장")
	public void test1() throws IOException {
		FileOutputStream fw = new FileOutputStream("c:/Temp/data.txt");
		int readByte;
		while((readByte = System.in.read()) != -1 ) {   //Ctrl + Z
			fw.write(readByte);
		}
		fw.close();
	}
	
	//@Test
	@DisplayName("파일내용을출력")
	public void test2() throws IOException {
		FileInputStream fi = new FileInputStream("c:/Temp/data.txt");
		int readByte;
		while((readByte = fi.read()) != -1 ) {
			System.out.print((char)readByte);
		}
		fi.close();
	}
	
	@Test
	@DisplayName("파일복사")
	public void test3() throws IOException {
		FileInputStream fi = new FileInputStream("c:/Temp/data.txt");
		FileOutputStream fo = new FileOutputStream("c:/Temp/data2.txt");
		int readByte;
		while((readByte = fi.read()) != -1 ) {
			fo.write(readByte);
		}
		fi.close();
		fo.close();
	}
}

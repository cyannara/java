package io2;

import java.io.FileReader;
import java.io.FileWriter;

/*
 * 문자스트림 (2바이트를 읽어서 인코딩해서 입출력)
 * FileReader, FileWriter
 */
public class WriterTest {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("d:/upload/data.txt");
		fw.write('A');
		fw.write('\uac01');
		fw.close();
		
		FileReader fr = new FileReader("d:/upload/data.txt");
		int a = fr.read();
		int b = fr.read();
		System.out.println((char)a + ":" + (char)b);
	}

}

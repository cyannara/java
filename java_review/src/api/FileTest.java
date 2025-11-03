package api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileTest {

public static void main(String[] args) throws IOException {

		// 폴더생성
		File path = new File("c:/Temp/doc");
		if(! path.exists()) {		
			path.mkdir();
		}
		
		// 파일정보 확인
		File file = new File("c:/Temp/output.txt");
		System.out.println("파일크기: "+file.length());
		
		// 파일삭제
		//file.delete();
		
		// 폴더 목록
		System.out.println("============폴더목록");
		File temp = new File("c:/Temp");
		
		String[] list = temp.list();
		for(String filename :list) {
			System.out.println(filename);
		}
		
		// 파일생성
		File newFile = new File(temp, "file.txt");
		FileWriter fw = new FileWriter(newFile);
		fw.write("hello");
		fw.close();
		
		//파일읽기
		System.out.println("============파일내용");
		newFile = new File(temp, "file.txt");
		FileReader fr = new FileReader(newFile);
		int buf;
		while((buf=fr.read()) != -1) {
			System.out.print((char)buf);
		}
		fr.close();
	}

	
}

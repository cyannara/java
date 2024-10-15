package day01.입출력2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *   파일 정보확인, 파일삭제, 파일이동, 파일명 변경 (파일=폴더)
 */
public class FileTest {

	public static void main(String[] args) throws IOException {
		//1. 빈 파일을 생성
		//File file = new File("d:/sample.txt");
		//file.createNewFile();
		
		//2. 파일 삭제
		//File file = new File("d:/sample.txt");
		//file.delete();
		
		//3. 폴더 생성
		//File file = new File("d:/myjava");
		//file.mkdir();
		
		//4. 파일정보 확인
		/*File file = new File("d:/javatext.txt");
		System.out.println("파일경로명: " + file.getAbsolutePath());
		System.out.println("파일명: " + file.getName());
		System.out.println("파일크기: " + file.length());
		System.out.println("생성시간: " + new Date(file.lastModified()) );*/
		
		//5. 폴더목록
		File file = new File("D:\\eclipse");
		
		String[] list =  file.list();
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
		File[ ] flist = file.listFiles();
		for(int i=0; i<flist.length; i++) {
			if( flist[i].isFile() ) {
				System.out.println( "file:" + flist[i].getName() );
			} else {
				System.out.println( "folder:" + flist[i].getName() );
			}
		}
		
	}

}

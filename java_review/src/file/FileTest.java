package file;

import java.io.File;

import org.junit.jupiter.api.Test;

public class FileTest {

	@Test
	public void fileTest() {
		//폴더생성
		//File folder = new File("c:/Temp/txt");
		//folder.mkdir();

		//파일정보 확인
		//File file = new File("c:/Temp/a.txt");
		//System.out.println(file.length());
		
		//파일삭제
		//file.delete();
		
		
		//폴더 목록
		File file = new File("C:/Users");
		String[] list = file.list();
		for(int i=0; i< list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
	
}

package day09.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileCopyTest {

	public static void main(String[] args) throws Exception {

		//입력파일
		FileInputStream fis = new FileInputStream("d:/upload/2.png");
		//출력파일
		FileOutputStream fos = new FileOutputStream("d:/upload/3_copy.png");
		
		byte[] data = new byte[1024];
		int len;
		while(true) {
			len = fis.read(data);
			if(len == -1) break;   //파일끝에 다다르면 -1 리턴
			fos.write(data,0, len);			
		}
		fis.close();
		fos.close();
	}

}

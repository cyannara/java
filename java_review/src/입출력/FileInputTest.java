package 입출력;

import java.io.*;

public class FileInputTest {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("d:/javatest.txt");
		OutputStream out = new FileOutputStream("d:/javatest2.txt");
		
		byte[] buf = new byte[1024];
		
		while(true) {
			int bData = in.read(buf);   // 읽어들인 바이트 길이
			if(bData == -1) break;
			//System.out.print(bData);  콘솔출력
			out.write(buf, 0, bData);   // 파일로 출력
		}
		in.close();
		out.close();
	}
}

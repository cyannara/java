package �����;

import java.io.*;

public class FileInputTest {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("d:/javatest.txt");
		OutputStream out = new FileOutputStream("d:/javatest2.txt");
		
		byte[] buf = new byte[1024];
		
		while(true) {
			int bData = in.read(buf);   // �о���� ����Ʈ ����
			if(bData == -1) break;
			//System.out.print(bData);  �ܼ����
			out.write(buf, 0, bData);   // ���Ϸ� ���
		}
		in.close();
		out.close();
	}
}

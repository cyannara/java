package 입출력;

import java.io.*;

/**
 * 데이터 타입별로 입력 
 *
 */
public class DataFilterTest {

	public static void main(String[] args) throws IOException  {
		
		// 파일 저장
		OutputStream out = new FileOutputStream("d:/javatest.txt");
		BufferedOutputStream bufFilterOut = new BufferedOutputStream(out);
		DataOutputStream filterOut = new DataOutputStream(bufFilterOut);		
		filterOut.writeInt(2000);
		filterOut.writeDouble(566.1456);
		filterOut.close();		
		
		// 파일 읽기
		InputStream in = new FileInputStream("d:/javatest.txt");
		BufferedInputStream bufFilterIn = new BufferedInputStream(in);		
		DataInputStream filterIn = new DataInputStream(bufFilterIn);
		int a = filterIn.readInt();
		double b = filterIn.readDouble();		
		filterIn.close();
		
		// 결과 확인
		System.out.println(a + " : " + 
		                   b + " : "  );
	}

}

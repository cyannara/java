package �����;

import java.io.*;

/**
 * ������ Ÿ�Ժ��� �Է� 
 *
 */
public class DataFilterTest {

	public static void main(String[] args) throws IOException  {
		
		// ���� ����
		OutputStream out = new FileOutputStream("d:/javatest.txt");
		BufferedOutputStream bufFilterOut = new BufferedOutputStream(out);
		DataOutputStream filterOut = new DataOutputStream(bufFilterOut);		
		filterOut.writeInt(2000);
		filterOut.writeDouble(566.1456);
		filterOut.close();		
		
		// ���� �б�
		InputStream in = new FileInputStream("d:/javatest.txt");
		BufferedInputStream bufFilterIn = new BufferedInputStream(in);		
		DataInputStream filterIn = new DataInputStream(bufFilterIn);
		int a = filterIn.readInt();
		double b = filterIn.readDouble();		
		filterIn.close();
		
		// ��� Ȯ��
		System.out.println(a + " : " + 
		                   b + " : "  );
	}

}

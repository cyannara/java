package �����;

import java.io.*;

/**
 * ���� ��Ʈ���� ���� �а� �����ϱ� 
 *
 */
public class FileReaderTest {

	public static void main(String[] args) {
		
		//���� ���� ����
		try {
			Writer fw = new FileWriter("d:/hyper.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("�ڹ� ����");
			bw.newLine();
			bw.write("ȫ�浿 �ȳ�.");
			bw.newLine();
			bw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}		
		//���� ���� �б�
		try {
			//Reader fr = new FileReader("d:/hyper.txt");
			BufferedReader br = new BufferedReader(new FileReader("d:/hyper.txt"));
			String ch = br.readLine();
			System.out.println(ch);
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

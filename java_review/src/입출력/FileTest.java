package �����;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *   ���� ����Ȯ��, ���ϻ���, �����̵�, ���ϸ� ���� (����=����)
 */
public class FileTest {

	public static void main(String[] args) throws IOException {
		//1. �� ������ ����
		//File file = new File("d:/sample.txt");
		//file.createNewFile();
		
		//2. ���� ����
		//File file = new File("d:/sample.txt");
		//file.delete();
		
		//3. ���� ����
		//File file = new File("d:/myjava");
		//file.mkdir();
		
		//4. �������� Ȯ��
		/*File file = new File("d:/javatext.txt");
		System.out.println("���ϰ�θ�: " + file.getAbsolutePath());
		System.out.println("���ϸ�: " + file.getName());
		System.out.println("����ũ��: " + file.length());
		System.out.println("�����ð�: " + new Date(file.lastModified()) );*/
		
		//5. �������
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

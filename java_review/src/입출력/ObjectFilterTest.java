package �����;

import java.io.*;

import javautil.Emp;

/**
 * ��ü(�ν��Ͻ�) �� ��°�� �����ϰ� �б� 
 */
public class ObjectFilterTest {

	public static void main(String[] args) throws Exception {
/*		//����
		ObjectOutputStream out = 
		new ObjectOutputStream(new FileOutputStream("d:/object.dat"));
		
		//Ű�����Է�
		
		out.writeObject(new Emp("�浿","ȫ",2000));
		out.writeObject(new Emp("����","��",1000));
		
		out.close();*/
		
		//�б�
		FileInputStream fi = new FileInputStream("d:/object.dat");
		ObjectInputStream in = new ObjectInputStream(fi);
		while(fi.available() > 0){		
			Emp emp1 = (Emp)in.readObject();   //EOFexception
			System.out.println(emp1);
		}
		in.close();		
	}
}

package �����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javautil.Emp;

/**
 * ��������� �ַܼ� �Է¹޾Ƽ� Object ���·� ���Ͽ� ����
 *
 */
public class ConsoleObjectFileTest {

	public static void main(String[] args) throws Exception {

		// �Էº��� ����
		String fname;
		long salary;

		// Scanner �Է�
		Scanner scan = new Scanner(System.in);
		fname = scan.next();
		salary = scan.nextLong();

		// Emp ��ü�� �����ؼ� File �� ���� ( emp.txt )
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/emp.dat"));
		out.writeObject(new Emp(fname, null, salary));
		out.close();

		// �б�
		FileInputStream fi = new FileInputStream("d:/emp.dat");
		ObjectInputStream in = new ObjectInputStream(fi);
		while (fi.available() > 0) {
			Emp emp1 = (Emp) in.readObject(); // EOFexception
			System.out.println(emp1);
		}
		in.close();
	}

}

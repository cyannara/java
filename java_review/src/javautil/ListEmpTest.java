package javautil;

import java.util.ArrayList;

/**
 * ������� ����
 * @author user
 *
 */
public class ListEmpTest {

	public static void main(String[] args) {
		
		ArrayList<Emp> list = new  ArrayList<Emp>();
		//��� �߰�
		Emp e = new Emp();
		e.setFirstName("����");
		e.setLastName("��");
		e.setSalary(2000);
		list.add(e);
		
		list.add(new Emp("�浿", "ȫ", 4000));
		
		System.out.println(list);
		
		//����̸�(firstName)�� ���
		for(Emp f : list ) {
			System.out.println(f.getFirstName());
		}
	}
}

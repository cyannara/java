package 클래스;

/** 
 * ����
 * @author user
 *
 */

public class CalcTest {

	public static void main(String[] args) {

		// ��ü����
/*		Calcurator c = new Calcurator();
		c.setInNum1(10);
		c.setInNum2(15);
		c.add();
		System.out.println(c.getResult());
		
		
		Calcurator.name = "SAMSUNG";
		
		System.out.println("������: " + c.name );
		
		Calcurator d = new Calcurator();
		System.out.println("������: " + d.name );*/
		
		//System.out.println(Calcurator.name);
		
		//System.out.println(CalcStatic.add(10,15));
		
		
		CalcEX c3 = new CalcEX();
		c3.setInNum1(10);
		c3.setInNum2(15);
		c3.add();
		System.out.println(c3.getResult());
		
		c3.mod();
		System.out.println(c3.getResult());
	}
	
}

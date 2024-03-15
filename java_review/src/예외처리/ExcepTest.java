package 예외처리;

import java.io.FileInputStream;

public class ExcepTest {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=0;  //입력

		//FileInputStream f = new FileInputStream("a.txt");
		
		try {
			a = a/b;
			
			try {
				sub1();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ArithmeticException e) {
			System.out.println("0이 입력" +e.getMessage());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
			
		
		System.out.println("program end");
	}
	
	public static void sub1() throws NullPointerException  {
		String s = null;
		int a  = s.length();
	}
}

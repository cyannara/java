package day06.api.date;

import java.util.Date;

/**
 * ��Ʈ���� ��¥ Ÿ�� ��ȯ
 * 1. simpleDateFormat �̿�
 * 2. Date �Ǵ� Calendar �̿�
 * @author user
 *
 */
public class ConsersionDate {

	public static void main(String[] args) {
		String s = "2017/04/12";
		Date d = null;
		
		//1. String   -> Date
		d = s;
		
		
		//2. Date     -> String
		s = d;
		
		System.out.println(s +" : " + d );
	}

}

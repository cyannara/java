package util;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Calendar,  Date (util)
 * LocaleDate (javafx)
 * @author user
 *
 */
public class DateTest {

	public static void main(String[] args) {
		//Date
		Date  today = new Date();
		System.out.println(today);
		
		//String --> Date
		
		
		//Date  --> String   
		SimpleDateFormat  formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strToday = formatter.format(today);
		System.out.println(strToday);
		
		//날짜 계산
		
		
		//현재날짜와 시간 조회
		
		
	}

}

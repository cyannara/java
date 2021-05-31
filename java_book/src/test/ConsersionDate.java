package test;

import java.util.Date;

/**
 * 스트링과 날짜 타입 변환
 * 1. simpleDateFormat 이용
 * 2. Date 또는 Calendar 이용
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

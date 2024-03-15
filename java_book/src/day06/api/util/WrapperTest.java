package day06.api.util;

import java.util.Date;

public class WrapperTest {
	public static void main(String[] args) {
		//int result = StringUtil.toInt("1234");
		//System.out.println(result);
		//String s = StringUtil.toStr(1234);
		//System.out.println(s);
		//파일명에서 확장자만 추출
		//String ext = StringUtil.getExt("a.b.hwp");
		//System.out.println(ext);
		
		//Date result = DateUtil.toDate("2021-02-10");
		//System.out.println(result);
		
		//String str = DateUtil.toStr(new Date());
		//System.out.println(str);
		
		String str2 = DateUtil.toStr(new Date(), "dd");  //요일, 1년중에 몇일째
		System.out.println(str2);
		
		//날짜 계산
		Date today = new Date();
		//Date meetDay = DateUtil.addDay(today, 100);
		//System.out.println(DateUtil.toStr(meetDay));
		
	}
}

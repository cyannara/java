package pkg.collect;

import java.beans.Encoder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class StringTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "hello everybody!!";
		char c =str.charAt(1);
		System.out.println("인덱스 위치의 한글자:" + c );
		System.out.println(str.substring(6,11));
		
		System.out.println(str.contains("body"));
		System.out.println(str.endsWith("!!"));
		System.out.println(str.startsWith("hel"));
		
		String num = "201030-1231234";
		String[] arr = num.split("-");
		System.out.println(arr[0]);
		System.out.println(arr[1].charAt(0));
		
		String path = "c:/tmep/image/a.jpg";
		int pos = path.indexOf("/");
		int pos2 = path.lastIndexOf("/");
		int pos3 = path.lastIndexOf("/", pos2+1);
		System.out.println(pos +":"+pos2);
		
		//마지막 .의 위치 +1 부터 끝까지  : lastIndexOf, substring
		//System.out.println("확장자:" + path.substring(path.lastIndexOf(".")+1));
		System.out.println("파일명:" + StringUtil.getFilename(path));
		System.out.println("확장자:" + StringUtil.getExtention(path));
		System.out.println("경로:"   + StringUtil.getPath(path));
		
		String b = "문자열 문자     문자";
		String d = new String(b.getBytes(),"euc-kr");

		b = b.replace("문자", "숫자");
		System.out.println(b);
	}

}

package day06.api.util;

public class StringUtil {
	//1. String -> int
	public static int toInt(String s) {     
		if (s == null) 
			return -1;
		return Integer.parseInt(s);
	}
	//2. int -> string
	public static String toStr(int s) {        
		return Integer.toString(s);
	}

	/**
	 * 파일명에서 확장자를 추출
	 * @param pathname
	 *     파일명
	 * @return 확장자
	 */
	public static String getExt(String pathname) {
		String result= "";
		//to do
		
		return result;
	}
	
	/**
	 * 경로명에서 파일이름만 추출
	 * @param pathname 경로명 "c:/img/item/p01.jpg
	 * @return  파일명 p01.jpg
	 */
	public static String getFilename(String pathname) {
		String result= "";
		//to do		
		return result;
	}	
	/**
	 * 경로명에서 경로만 추출
	 * @param pathname 경로명 "c:/img/item/p01.jpg
	 * @return  경로 c:/img/item
	 */
	public static String getPath(String pathname) {
		String result= "";
		//to do		
		return result;
	}	
}

package co.api.util;
/** 
 * 문자열 조작 
 * @author user
 *
 */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 문자열 자르기 ( substring, charAt)
		String id = "780101-2581234";
		String sex = id.substring(7, 8);
		System.out.println( sex.equals("1") ? "남자" : "여자");
		
		//2.경로명에서 파일명만 조회  (indexOf, lastIndexOf)
		String pathName = "c:/temp/java/manual.hwp";
		int idx = pathName.lastIndexOf('/');
		System.out.println("검색위치: " +  idx);
		
		// 확장자 포함한 파일이름
		String filenameExt = pathName.substring(idx+1) ;
		System.out.println(filenameExt);
		
		//파일이름만 출력
		String filename = pathName.substring(idx+1, pathName.lastIndexOf('.'));
		System.out.println(filename);
		
		//split ( 문자열을 잘라서 배열에 넣어줌)
		String fruits = "사과,배,바나나,포도";
		String[] fruitArray = fruits.split(",");
		System.out.println("두번째 과일은 " + fruitArray[1]);
		
		//valueOf   기본데이터형  -> String   (== Integer.toString() ) 
		int i = 10;
		String s = String.valueOf(i);
		
		int kor=10, eng=100;
		System.out.println("국어는 " + kor + " 영어는 " + eng);
		System.out.println( String.format("국어는 %d 영어는 %d 입니다.", kor, eng) ) ;
	}

}

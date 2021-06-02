package pkg;
/*
 * 정적메서드 안에서는 정적필드만 접근할 수 있음
 * 접근제어자 : private >    default     >   protected      > public
 *               클내스내부   같은패키지    다른패키지-상속
 */
public class DateUtil {
	public static String curDate() {
		return "20210602";
	}
}

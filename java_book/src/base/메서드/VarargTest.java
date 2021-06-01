package base.메서드;
/**
 * 가변인수 
 *
 */
public class VarargTest {
	public static void main(String[] args) {
		/*for(String temp : args) {
			System.out.println(temp);
		}*/
		showAll(args);
		showAll("홍길동");
		showAll("홍길동","김유신");
		showAll("홍길동","가","나");	
	}
	
	public static void showAll(String ... arr) {
		for(String s : arr) {
			System.out.println(s);
		}
	}
}

package co.yedam.tv.standalone;
/**
 * 
 * @author dbal
 * 개발완료 후 TV가 변경된다면 두 클래스의 메서드가 다르면 
 * 메서드가 사용된 곳을 찾아서 변경해야 한다.  
 *  -> 소스 수정이 되어야 함.  
 *  소스를 변경하지 않고 클래스를 교체하려면 메서드 선언부를 완전히 동일하게 설계(메서드 호출방법이 동일)
 *
 */
public class MainApp {
	public static void main(String[] args) {
		
		//SamsungTV tv = new SamsungTV();
		LgTV tv = new LgTV();
		tv.powerOn();
		tv.soundUp();   //tv.volumeUp();    
		tv.soundDown(); // tv.volumeDown(); 
		tv.powerOff();
	}
}

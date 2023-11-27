package 인터페이스;
/*
 * 상수와 추상메서드로만 구성
 */
public interface RemoteController {
	//상수
	public final String NAME = "삼성";
	String NAME1 = "삼성";
	//추상메서드
	public abstract void turnOff() ; 
	void turnOn() ;
}
interface VolumeController {
	void volumeUp();
	void volumeDown();
}
class TV implements RemoteController {
	public void turnOff() {		System.out.println("tv off");	}
	public void turnOn() {		System.out.println("tv on");	}
}
class Audio implements RemoteController, VolumeController  {
	public void turnOff() {	System.out.println("audio off");}
	public void turnOn() {	System.out.println("audio on");	}
	public void volumeUp() {  System.out.println("audio volume up");      }
	public void volumeDown() {System.out.println("audio volume down");}
}
class Test {
	public static void main(String[] args) {
		TV a = new TV();
		a.turnOn();
		Audio b = new Audio();
		b.turnOn();
	}
}






package co.yedam.tv.defaultmethod;

public class SkTV implements RemoteControl{
	public void powerOn() {
		System.out.println("SK TV--전원 on");
	}
	public void powerOff() {
		System.out.println("SK TV--전원 off");
	}
	public void volumeUp() {
		System.out.println("SK TV--볼륨 up");
	}
	public void volumeDown() {
		System.out.println("SK TV--볼륨 down");
	}	

}

package co.yedam.tv.example;

public class SamsungTV extends TV implements RemoteControl {
	
	public SamsungTV() {
		System.out.println("SamsungTV 객체생성 1");
	}	
	public void powerOn() {
		System.out.println("삼성 TV--전원 on");
	}
	public void powerOff() {
		System.out.println("삼성 TV--전원 off");
	}
	public void volumeUp() {
		System.out.println("삼성 TV--볼륨 up");
		volume ++;
	}
	public void volumeDown() {
		System.out.println("삼성 TV--볼륨 down");
		volume --;
	}
	public void printStatus() {
		System.out.println("삼성 TV 볼륨:" + volume + " 채널:" + channel);
	}
}

package co.micol.tv.example;

public class LgTV extends TV implements RemoteControl {
	public void powerOn() {
		System.out.println("LG TV--전원 on");
	}
	public void powerOff() {
		System.out.println("LG TV--전원 off");
	}
	public void volumeUp() {
		System.out.println("LG TV--볼륨 up");
		volume ++;
	}
	public void volumeDown() {
		System.out.println("LG TV--볼륨 down");
		volume --;
	}	
	public void printStatus() {
		System.out.println("LG TV 볼륨:" + volume + " 채널:" + channel);
	}
}

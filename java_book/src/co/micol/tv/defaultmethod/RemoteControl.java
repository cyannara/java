package co.micol.tv.defaultmethod;

public interface RemoteControl {
	public void powerOn() ;
	public void powerOff() ;
	public void volumeUp() ;
	public void volumeDown();
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
}

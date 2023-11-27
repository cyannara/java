package co.yedam.tv.example;

public class MainApp {
	public static void main(String[] args) {
		RemoteControl tv = new LgTV(); 
		//RemoteControl tv = new SamsungTV();  	//자동타입변환
		tv.powerOn();							//다형성 : 참조하는 객체의 메서드가 호출
		tv.volumeUp();  
		tv.printStatus();
		tv.volumeDown();
		tv.powerOff();
	}
}

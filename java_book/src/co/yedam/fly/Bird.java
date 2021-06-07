package co.yedam.fly;

public class Bird extends Animal implements Flyer{
	
	public void run() {
		System.out.println("날아 다닌다.");
	}
	
	public void eat() {
		System.out.println("주로 벌레를 먹는다.");
	}
	
	@Override
	public void takeOff(){
		System.out.println("Bird 이륙");
	}

	@Override
	public void fly() {
		System.out.println("Bird 비행");
	}

	@Override
	public void land() {
		System.out.println("Bird 착륙");
	}

	public void layEggs() {
		System.out.println("Bird 알을 낳다");
	}
}

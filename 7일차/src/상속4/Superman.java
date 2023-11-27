package 상속4;

public class Superman extends Human implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("슈퍼맨 이륙 - 손을 위로 들어올리고");
	}

	@Override
	public void fly() {
		System.out.println("슈퍼맨 비행");
	}

	@Override
	public void land() {
		System.out.println("슈퍼맨 착륙");
	}

}

package co.yedam.fly;

public class Airplane implements Flyer {
	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙- 이륙 할 때까지 가속. 랜딩 기어를 올리다");
	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행 - 엔진을 계속 가동");
	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙 - 랜딩기어를 내리고 땅에 닿을 때까지 플랩을 낮추고 감속한다. 브레이크");
	}
	
}

package day07.상속도형2;

public class Circle implements Drawable, Movable {

	@Override
	public void move() {
		System.out.println("원 이동");
	}
	@Override
	public void draw() {
		System.out.println("원 그리기");
	}

}

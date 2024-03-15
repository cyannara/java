package day07.상속2;

public class Tri extends Shape {

	private int h;

	public Tri(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void area() {
		result = w * h /2;
	}
}

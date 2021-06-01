package co.yedam.상속2;

public class Rect extends Shape {

	private int h;

	public Rect(int w, int h) {
		super(w);
		this.h = h;
	}

	@Override
	public void area() {
		result = w * h;
	}
	
/*	public void area() {
		result = w * h;
	}*/
}

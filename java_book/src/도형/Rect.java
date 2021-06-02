package 도형;

public class Rect extends Shape 
implements Drawable, Movable{
	private int h;
	public Rect(int w, int h) {
		super(w);
		this.h = h;
	}
	@Override
	public void area() {
		result = w * h;
	}
	@Override
	public void draw() {
		System.out.println("Rect draw");
	}
	@Override
	public void move() {
		System.out.println("Rect move");		
	}
}

package day07.상속도형;

public class Circle extends Shape
implements Drawable, Movable {
	public Circle(int w) {
		super(w);
		//this.w = w;
	}

	@Override //재정의
	public void area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		System.out.println("원 이동");
	}
	@Override
	public void draw() {
		System.out.println("원 그리기");
	}



//	@Override
//	public void area() {
//		result = w * w *3.14;
//	}	


}

package 상속;

public class Circle extends Shape {


	public Circle(int w) {
		this.w = w;
	}
	
	public void area() {
		result = w * w * 3.14;
	}
}

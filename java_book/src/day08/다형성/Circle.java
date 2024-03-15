package day08.다형성;

public class Circle  extends Shape 
implements drawable {

	public void draw() {
		System.out.println("원");		
	}
}
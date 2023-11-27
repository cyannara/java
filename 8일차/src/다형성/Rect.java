package 다형성;

public class Rect extends Shape 
implements drawable {

	public void draw() {
		System.out.println("사각형");		
	}
}

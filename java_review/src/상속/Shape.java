package 상속;
/**
 * (Shape) 도형   ->  Rect(사각형),  
 *                  Tri(삼각형),  
 *                  Circle(원)
 */
public abstract class Shape {
	protected int w;
	protected double result;
	
	public Shape() {}
	public Shape(int w) {
		if ( w > 0 ) 
			this.w = w;
		else 
			w = 1;
	}
	
	public void print() {
		System.out.println("면적 : " +  result);
	}
	
	public abstract void area();
}

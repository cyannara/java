package day07.상속도형;
/**
 * (Shape)    ->   Rect,  
 *                  Tri,  
 *                  Circle
 */
public  abstract class Shape {
	int w;
	double result;	
	public Shape() {}
	public Shape(int w) {
		this.w = w;
	}	
	public void print() {
		System.out.println("면적="+ result);
	}
	public abstract void area();
}

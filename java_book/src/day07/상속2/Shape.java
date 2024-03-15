package day07.상속2;
/**
 * (Shape) ����   ->  Rect(�簢��),  
 *                  Tri(�ﰢ��),  
 *                  Circle(��)
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
		System.out.println("���� : " +  result);
	}
	
	public abstract void area();
}

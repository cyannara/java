package day07.상속3;

public class Cat extends Animal {
	public void run() {
		System.out.println("네발로 걸어다닌다.");
	}
	
	public void eat() {
		System.out.println("육식만 먹는다.");
	}
	
	public void color() {
		System.out.println("고양이는 검은색이다.");
	}
}

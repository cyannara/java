package co.yedam.상속3;

public class MainApp {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();
		dog.run();  //자식의 객체에서 정의한 것을 따라간다.(자동 오버라이드 됨)
		dog.sleep();
		((Dog) dog).color();
		
		System.out.println("===================");
		
		Animal bird = new Bird();
		bird.run();
		bird.eat();
		((Bird) bird).color();
		
		
		System.out.println("=================");
		
		Animal animal = new Animal();
		animal.run();
	}

}

package day03.co.yedam.star;

public class StarApp {

	
	
	//삼각형 출력  
	void draw(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.println(pad('#',i));
		}
	}

	/*
	역삼각형 오른쪽
	 ####  
	  ###
	   ##
	    #
	*/
	void drawInvert(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.println(pad('#',cnt+1-i));
		}
	}
	//이등변삼각형
	void drawEq(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print(pad(' ', i )); //공백
			System.out.println(pad('*', i  ));
		}
	}
	//이등변 역삼각형
	void drawEqInvert(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print(pad(' ',i )); //공백
			System.out.println(pad('*', i ));
		}
	}
	
	//"*"*3
	//(*,10)  --> "*********"
	String pad(char s, int cnt) {
		String result = "";
		for(int i=0; i<cnt; i++) {
			result = result + 's';
		}
		return result;
	}
}

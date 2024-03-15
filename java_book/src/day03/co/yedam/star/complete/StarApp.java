package day03.co.yedam.star.complete;


public class StarApp {

	int cntDefault = 5;
	char shapeDefault = '*';

	

	String pad(char s, int cnt) { 
		String result = "";
		for(int j=0; j<cnt; j++) {
			result += s;
		}
		return result;
	}
	
	void drawUp(int cnt, char shape) {
		for(int i=1; i<cnt; i++) {
			System.out.println(pad(' ', cnt-i) + pad(shape,i));
		}
	}
	//default 매개변수가 없으므로 오버로딩으로 해결
	void drawUp(int cnt) {
		drawUp(cnt, shapeDefault);
	}
	
	void drawUp() {
		drawUp(cntDefault, shapeDefault);
	}
	
	/*
	 #
	 ##
	 ###
	 ####  
	*/
	void draw(int cnt, char shape) {
		for(int i=1; i<cnt; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}
	}
	
	
	
	/*
	       #
	      ##
	     ###
	    ####  
	 */
	void drawRight(int cnt, char shape) {
		for(int i=1; i<cnt; i++) {
			for(int j=0; j<cnt-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}
	}
	

	/*
	역삼각형 오른쪽
	 ####  
	  ###
	   ##
	    #
	*/
	void drawInvertRight(int cnt, char shape) {
		for(int i=1; i<cnt; i++) {
			System.out.println(pad(' ', cnt-i) + pad(shape,i));
		}
	}
	

	/*
	역삼각형 왼쪽
	 ####  
	 ###
	 ##
	 #	
	 */
	void drawInvert (int cnt, char shape) {
		for(int i=1; i<cnt; i++) {
			for(int j=0; j<cnt-i; j++) {
				System.out.print(shape);
			}
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	/*
	이등변삼각형(1부터 시작) .첫번째 출력위치가 50번째칸에서 출력
	                 #
	                ###
	               #####
	              #######  
	*/
	void drawEq(int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.println(pad(' ', 50-i) + pad('x',i*2-1));
		}
	}
	
	/*
	이등변삼각형 (시작갯수를 지정)
	                ###
	               #####
	              #######  
	*/
	void drawEq(int start, int cnt) {
		for(int i=start; i<cnt; i++) {
			System.out.println(pad(' ', 50-i) + pad('x',i*2-1));
		}
	}
	
	/*
    이등변역삼각형
	             #######  
	              #####
	               ###
	                #
	*/
	void drawEqInvert(int cnt) {
		for(int i=1; i<cnt; i++) {
			System.out.println(pad(' ', i) + pad('x',(cnt-i)*2-1));
		}
	}
	
	//나무기둥
	void drawRect(int cnt) {
		for(int i=1; i<cnt; i++) {
			System.out.println(pad(' ', 48) + pad('x',3));
		}
	}
	
	void drawTitle(String title, int cnt) {
		System.out.println(pad('=', cnt));
		System.out.println(title);	
		System.out.println(pad('=', cnt));
	}
}



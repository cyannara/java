package co.yedam.star3;


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
	//default �Ű������� �����Ƿ� �����ε����� �ذ�
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
	���ﰢ�� ������
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
	���ﰢ�� ����
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
	�̵�ﰢ��(1���� ����) .ù��° �����ġ�� 50��°ĭ���� ���
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
	�̵�ﰢ�� (���۰����� ����)
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
    �̵���ﰢ��
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
	
	//�������
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



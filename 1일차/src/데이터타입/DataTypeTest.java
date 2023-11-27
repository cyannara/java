package 데이터타입;

class DataType {
	boolean b;
	char    c;
	int     i;
	double  d;
	String  s = "hi";
}

public class DataTypeTest {
	public static void main(String[] args) {
		boolean  b = false;
		char     c = 0;
		int      i = 0;
		double   d = 0;
		String   s = "hi";		
		DataType data = new DataType(); 
		
		System.out.println( "boolean: " + data.b + " \t " + b );
		System.out.println( "char   : " + data.c + " \t " + c );
		System.out.println( "int    : " + data.i + " \t " + i );
		System.out.println( "double : " + data.d + " \t " + d );
		System.out.println( "string : " + data.s + " \t " + s );	
		System.out.println( "==     : " + (data.s ==  s) );
	}
}


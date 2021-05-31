package 변수;
/** 
 * 
 * @author user
 * wrapper �겢�옒�뒪
 */
public class WrapperTest {

	public static void main(String[] args) {

		//1. int  -> String
		String  a = Integer.toString(100);
		
		//2. String -> int
		int     b = Integer.parseInt("100");
		
		double c = 10.56;
		//3. double -> string
		a = Double.toString(c);
		
		//4. string -> double
		c = Double.parseDouble(a);
		
		double d = 10.1;
		Double objD; 
		
		//5. Boxing   : 
		objD = d;
		objD = new Double(d);
		
		//6. Unboxing 
		d = objD;
		d = objD.doubleValue();
		
		
		float f = (float)objD.doubleValue();
		f = objD.floatValue();
		
		String g = "1111";
		System.out.println("1111 �쓽 10吏꾩닔�뒗 : " +  Integer.parseInt(g, 2));
		
		g = "1F";  //16吏꾩닔
	
	}

}

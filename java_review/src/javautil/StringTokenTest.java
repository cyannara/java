package javautil;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.MatchResult;

public class StringTokenTest {
	public static void main(String[] args) {
		
		String hobby = "자바,JSP.SPRING";
		StringTokenizer st = new StringTokenizer(hobby,",");
		
		System.out.println("토큰수 : " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println( st.nextToken() );
		}
		
		Scanner scan = new Scanner(hobby);
		scan.useDelimiter("[.,]");
		while ( scan.hasNext() ) {
			System.out.println( scan.next() );
		}
	
		System.out.println("==================");
				
/*	     String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
	     */
	     
		  String input = "1 fish 2 fish red fish blue fish";
		     Scanner s = new Scanner(input);
		     s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
		     MatchResult result = s.match();
		     for (int i=1; i<=result.groupCount(); i++)
		         System.out.println(result.group(i));
		     s.close();
	}
}

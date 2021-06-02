package base.codeblock;

public class CodeBlocks {

	private static String aField = "";
	private String bField = "";
	
	static {
		aField += "A";
	}
	
	{
		aField += "B";
		bField += "B";
	}
	
	public CodeBlocks() {
		aField += "C";
		bField += "C";
	}
	
	public void append() {
		aField += "D";
		bField += "D";
	}
	
	public static void main(String[] args) {
		System.out.println(aField);
		
		CodeBlocks cb = new CodeBlocks();
		cb.append();
		
		System.out.println(aField);
		System.out.println(cb.bField);
	}

}

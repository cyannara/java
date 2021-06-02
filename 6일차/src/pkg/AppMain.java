package pkg;

public class AppMain {
	static void print() {
		System.out.println("=====");
	}
	
	public static void main(String[] args) {
		Count count1 = new Count();
		Count.cnt1++;
		count1.cnt2++;
		
		Count count2 = new Count();
		Count.cnt1++;
		count2.cnt2++;
		
		Count count3 = new Count();
		Count.cnt1++;
		count3.cnt2++;
		
		System.out.println(count1.cnt1 +" : " + count1.cnt2);
		System.out.println(count2.cnt1 +" : " + count2.cnt2);
		System.out.println(count3.cnt1 +" : " + count3.cnt2);
		
		print();
		 
		//DateUtil dateUtil = new DateUtil();
		System.out.println(DateUtil.curDate());
		
		
		ProjectInfo.uploadpath = "/upload";
		System.out.println(ProjectInfo.name);
		
		ProjectInfo info = new ProjectInfo();
		//System.out.println(info.version);

	}
}

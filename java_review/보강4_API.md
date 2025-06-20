## JAVA API
1. String
2. Date, LocalDate, Calendar
3. List /  Set / Map

### String
```java
public class StringUtil {
	//문자형 날자에서 년도만 월
	public static String getYear(String date) {
		return date.substring(0, 4);
	}
	public static String getYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		return String.valueOf(year);
	}
	public static String getMonth(String date) {
		return date.substring(4, 6);
	}
}
```
```java
	public static void main(String[] args) {
		String year = StringUtil.getYear(new Date());
		System.out.println(year);
		String month = StringUtil.getMonth("20240408");
		System.out.println(month);
	}
```
###  File
```java
  File file = new File("c:/temp/apple.PNG");
	file.delete();
```
```java
	File file = new File("c:/temp/apple.PNG");
	file.renameTo(new File("c:/temp/애플.PNG"));
```
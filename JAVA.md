## 제어문
###  switch
```java
String 요일명;
switch(요일번호) {
  case 2: 요일명="월"; break;
  case 3: 요일명="화"; break;
  default : 요일명="일"; 
}
```
Java 12 ↑
```java
String 요일명 = switch(요일번호) {
  case 1 -> "월";
  case 2 -> "화";
  default -> "일";
}
```

#### javadoc 인코딩
```
-locale ko_KR -encoding UTF-8 -charset UTF-8 -docencoding UTF-8
```


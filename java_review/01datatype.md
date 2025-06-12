### 데이터 타입

```
데이터형
원시타입(Primitive type)
  ■ 불리언 : boolean                  --> Boolean
  ■ 문자 : char(유니코드, utf-16)     --> Character
  ■ 숫자
	   정수 : byte, short, int, long    --> Byte, Short, Integer, Long
	   실수 : float, double             --> Float, Double

참조타입(Reference type)
  ■ 문자열 : String
  ■ 날짜 : Date, Calendar,
          LocalTime, LocalDate, LocalDateTime, ZonedDateTime
          Period, Duration

```

1. 빈 칸에 알맞은 데이터타입을 지정하세요.

```java
		____ score = 90; // 회사평가점수
		____ rating = 4.5; // 회사 평점
		____ profit = 2_200_000_000l; // 회사 순이익

		____ mailYn = false;// 이메일 수신여부

		____ grade = 'A';// 회사등급
		____ name = "예담주식회사"; // 회사명

		System.out.println("score=" + score);
		System.out.println("rating=" + rating);
		System.out.println("profit=" + profit);
		System.out.println("mailYn=" + mailYn);
		System.out.println("grade=" + grade);
		System.out.println("name=" + name);
```

### 형변환

허용범위 크기순  
 byte < short < int < long < float < double

```java
		int a = 5 / 2;
		double b = 5 / 2;

    short s = i;
		double d3 = i;

		System.out.println(a);
		System.out.println(b);
```

### 문자열 형변환

```java
		String str1 = "12.56";
		double d = str1;

		String str2 = "3000";
		int i = str2;

		str = i;
		str = d;
```

### 유니코드

UTF-8 텍스트 파일에서 한글은 3바이트를 차지하며, 자바의 char 데이터 타입은 2바이트를 사용하여 UTF-16 인코딩으로 문자를 저장합니다. 따라서 자바에서는 3바이트 한글을 char로 표현하기 위해서는 UTF-8을 UTF-16으로 변환해야 합니다

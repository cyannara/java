### 수업목표

1. 데이터타입(변수/상수)
   - 상수도 데이터형이 있다. ( b, 0, 0x, f, l )
   - 값의 범위에 맞게 적절한 데이터타입을 선택해야 한다.
   - 데이터 타입별 허용범위와 정밀도를 알고 사용하자.
2. 형변환 (자동 / 강제 / 스트링<=>기본형)
   - 문자열을 기본타입으로
   - 기본타입을 문자열로
3. 연산자 (관계 / 삼항 / 논리 / 산술)
4. 유니코드와 인코딩방식 utf-8/utf-16

### 상수도 데이터형이 있다.

```
 사용 기호 :  b, 0, 0x, f, l

    정수형 상수
               10    (int)
               10L   (long)
         진수
               0b111 (2진수  0b 시작)
               0777  (8진수  0  시작)
               0xfff (16진수 0x 시작)

    실수형 상수
               10.0  (double)
               10.0F (float)
```

### 값의 범위에 맞게 적절한 데이터타입을 선택해야한다.

```
1. 데이터형
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


 2. 정수형 최대값(표현범위)
    실수형 유효자릿수
    오버플로우

```

실습문제

```java
  // 빈 칸에 알맞은 데이터타입을 지정하세요.
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

```
 ■ 메모리크기

   1        2       4      8         4       8
 byte  >  short >  int  > long                        정수형
                                 > float > double     실수형
          char                                        문자형


 ■  자동변환 허용범위 크기순
 byte < short < int < long < float < double
```

실습문제

```java
		int a = 5 / 2;
		double b = 5 / 2;

		short s = i;
		double d3 = i;

		System.out.println(a);
		System.out.println(b);
```

강제형변환

### 문자열 형변환

실습문제

```java
		String str1 = "12.56";
		double d = str1;

		String str2 = "3000";
		int i = str2;

		str = i;
		str = d;
```

### 연산자

```java
//암호화/복호화
int a = 10;
int key = 'a';
System.out.println("원문:"+ a);

int b = a ^ key;
System.out.println("암호화:"+ b);

int c = b ^ key;
System.out.println("복호화:"+ c);
```

### 유니코드

UTF-8 텍스트 파일에서 한글은 3바이트를 차지하며, 자바의 char 데이터 타입은 2바이트를 사용하여 UTF-16 인코딩으로 문자를 저장합니다. 따라서 자바에서는 3바이트 한글을 char로 표현하기 위해서는 UTF-8을 UTF-16으로 변환해야 합니다

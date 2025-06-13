### 수업목표

1. 위에서부터 아래로 실행되는 흐름을 개발자가 원하는 방향으로 제어할 수 있다. (제어문)
   - for / if / while / do~while / switch
2. 자바의 참조 타입을 이해한다.
   - NullPointerException
   - String
   - [] / Array

실습예제  
src/resources/engScore.txt

```text
80
90
100
30
40
```

반복되는 코드를 제거해보자.

```java

		//파일 입력
		File file = new File("src/resources/engScore.txt");
		Scanner sc = new Scanner(file);

		int score;
		int total = 0;

		score = sc.nextInt();
		total += score;

		score = sc.nextInt();
		total += score;

		score = sc.nextInt();
		total += score;

		score = sc.nextInt();
		total += score;

		score = sc.nextInt();
		total += score;

		//합계출력
		System.out.println(total);
```

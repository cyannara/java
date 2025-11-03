## Java 버전별 추가기능

### default method

default method는 인터페이스에 있는 구현메서드를 의미  
추상메서드를 추가하는 경우 구현 클래스들이 모두 변경되어야 하는 문제가 발생(OCP 원칙을 위배)하는데 디폴트 메서드를 사용하여 추가 변경을 막을 수 있음

```java
//추상 메서드
abstractMethod();

//디폴트 메서드: default 키워드를 붙이고 구현부 {}가 있어야함.
default defaultMethod() {}
```

OCP(Open Close Principle)

- 객체지향 설계 5대 원칙 중 하나
- 소프트웨어 구성요소(컴포넌트, 클래스, 모듈, 함수) 는 확장에 대해서는 개방(Open)되어야 하지만 변경에 대해서는 폐쇄(Close) 되어야 한다.

### 메소드 참조(::) 더블콜론

- lambda with method reference
- 람다식에서 파라미터를 중복해서 사용하고 싶지 않을 때 사용
- 클래스를 직접 사용하고 메소드를 참조
- static 인경우 인스턴스 대신 클래스 이름으로 사용
  ```java
  //[인스턴스]::[메서드명]
  testList.forEach(System.out::println);
  ```

### 스트림

- 람다를 활용해 배열과 컬렉션을 함수형으로 간단하게 처리할 수 있는 기술
- 스트림은 '데이터의 흐름’입니다. 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있고 또한 람다를 이용해서 코드의 양을 줄이고 간결하게 표현가능.
- 병렬처리

스트림에 사용에 대한 상세한 내용은 다음 3가지로 나눌 수 있다.

스트림 생성 - 스트림 인스턴스를 생성한다.  
스트림 가공 - 필터링/매핑 등 원하는 결과를 가공한다. n번 가능  
스트림 결과 생성 - 스트림 결과를 만들어 내는 작업을 한다. 1번만 가능

```java
    String[] strArr = {"키위","포도","바나나","사과","감","사과"};

    long cnt = Stream.of(strArr)  // 문자열배열이 소스인 스트림
         .filter(s -> s.length()>1)        // 걸러내기(중간연산)
        .distinct()                        // 중복 제거(중간연산)
        .count();                          // 요소 개수(최종연산)
    System.out.println(cnt);


    List<String> list = Stream.of(strArr)  // 문자열배열이 소스인 스트림
         .filter(s -> s.length()>1)        // 걸러내기(중간연산)
        .distinct()                        // 중복 제거(중간연산)
        .sorted()                          // 정렬(중간연산)
        .limit(2)                          // 스트림 자르기(중간연산)
        .collect(Collectors.toList());     // list로 변환(최종연산)
    System.out.println(list);

    Stream.of(strArr)  // 문자열배열이 소스인 스트림
     .filter(s -> s.length()>1)        // 걸러내기(중간연산)
    .distinct()                        // 중복 제거(중간연산)
    .sorted()                          // 정렬(중간연산)
    .limit(2)                          // 스트림 자르기(중간연산)
    .forEach(System.out::println);     // 반복문 출력(최종연산)
```

```java
        // 점수 평균 구하기
        double avg = students.stream()
                             .mapToInt(Student::getScore) // Stream<Student> → IntStream
                             .average()                   // 평균 계산
                             .orElse(0);                  // 값 없을 때 0
```

#### 스트림 생성

#### 스트림 중간연산 함수

| 기능         | 중간연산                       | 설명                      | 리턴타입  |
| :----------- | :----------------------------- | :------------------------ | :-------- |
| 필터         | filter(Predicate<T> predidate) | 조건에 안맞는 요소를 제외 | Stream<T> |
|              | distinct()                     | 중복을 제거               |           |
| 제한         | limit(long maxsize)            | 스트림의 일부를 잘라냄    |           |
|              | skip(long n)                   | 스트림의 일부를 건너뜀    |           |
| 정렬         | sorted()                       | 스트림의 요소를 정렬      |           |
|              | sorted(Comparator<T> comp)     |                           |           |
| 연산결과확인 | peek(Consumr<T> action)        | 스트림의 요소에 작업 수행 |           |
| 변환         | map(Function<T,R> mapper)      | 스트림 요소를 반환        |           |
|              | mapToDouble()                  |                           |           |
|              | mapToInt()                     |                           | IntStream |
|              | mapToLong()                    |                           |           |
|              | flatMap()                      |                           |           |
|              | flatMapToDouble()              |                           |           |
|              | flatMapToInt()                 |                           |           |
|              | flatMapToLong()                |                           |           |
|              |                                |                           |           |

#### 스트림 최종함수

| 리턴타입    | 최종연산                   | 설명                                                     |
| :---------- | :------------------------- | :------------------------------------------------------- |
| void        | forEach()                  | 각 요소에 지정된 작업 수행                               |
| void        | forEachOrdered()           | 병렬스트림으로 처리할 때 순서 유지                       |
| long        | count()                    | 스트림의 요소의 개수 반환                                |
| Optional<T> | findAny()                  | 스트림의 요소를 아무거나 하나를 반환. filter와 함께 사용 |
| Optional<T> | findFirst()                | 스트림의 첫번째 요소를 반환                              |
| boolean     | allMatch()                 | 주어진 조건을 모두 만족하는지 확인                       |
| boolean     | anyMAtch()                 | 주어진 조건을 하나라도 만족하는지 확인                   |
| boolean     | noneMatch()                | 주어진 조건을 모두 만족하지 않는지 확인                  |
| object[]    | toArray()                  | 스트림의 모든 요소를 배열로 반환                         |
| Optional<T> | reduce()                   | 스트림의 요소를 하나씩 줄여가면서 계산                   |
| R           | collect(Collector<T,A,R> ) | 스트림의 요소를 수집하여 반환                            |
| R           | toList()                   | 스트림의 요소를 수집하여 UnmodifiableList 반환           |

#### IntStream

| 리턴타입    | 최종연산         | 설명                           |
| :---------- | :--------------- | :----------------------------- |
| long        | sum(), average() | 스트림의 요소의 합계/평균 반환 |
| Optional<T> | max(), min()     | 스트림의 최대/최소값을 반환    |

### Optional

### reference

- [스트림](<(https://futurecreator.github.io/2018/08/26/java-8-streams/)>)
- [[자바의 정석 - 기초편] ch14-15,16 스트림, 스트림의 특징](https://www.youtube.com/watch?v=7Kyf4mMjbTQ&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=165&ab_channel=%EB%82%A8%EA%B6%81%EC%84%B1%EC%9D%98%EC%A0%95%EC%84%9D%EC%BD%94%EB%94%A9)

### Java16 추가기능

#### Record

https://digitalbourgeois.tistory.com/329

등장배경

- 기존의 데이터 클래스를 선언할 때 boilerplate code가 많다(equals, hashcode, toStirng, Constructor...)
- 새로 필드가 추가되면 toString, equals 메서드 등을 업데이트 해야 한다.

특징

- Java 16 이상에서 도입된 언어 내장 기능
- 불변(Immutable) 객체를 쉽게 생성(필드 유형과 이름만 필요)
- 데이터 중심 객체에 최적화. 클래스가 데이터 클래스임을 명시적으로 선언
- 컴파일러가 자동으로 생성: constructor, getter, equals(), hashCode(), toString()
- 상속 불가 (Record는 final이므로 다른 클래스를 상속할 수 없음)
- 레코드는 다른 클래스를 상속받을 수 없으며, private final fields 이외의 인스턴스 필드를 선언할 수 없습니다. 선언되는 다른 모든 필드는 static 이어야 합니다.

```java
public record ColorRecord(int red, int green, int blue) {

    public String getHexString() {
        return String.format("#%02X%02X%02X", red, green, blue);
    }
}
```

```java
public record Person(String name, String address) {} //생성자와 Getter, equals, hashcode, toString는 자동으로 만들어짐

//사용
Person person = new Persion("홍길동", "대한민국 대구시")
```

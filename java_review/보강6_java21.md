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
- 컴파일러가 자동으로 생성:  constructor, getter, equals(), hashCode(), toString()
- 상속 불가 (Record는 final이므로 다른 클래스를 상속할 수 없음)
- 레코드는 다른 클래스를 상속받을 수 없으며,  private final fields 이외의 인스턴스 필드를 선언할 수 없습니다. 선언되는 다른 모든 필드는 static 이어야 합니다.

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

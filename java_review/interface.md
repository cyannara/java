default method
==============
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





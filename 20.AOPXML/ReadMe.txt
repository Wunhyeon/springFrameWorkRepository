Spring AOP용어
-Joint Point : 모듈이 삽입되어 동작하게 되는 특정 위치(메서드 호출 등)
-Point Cut : 다양한 Joint Point 중에 어떤 것을 사용할 지 선택
-Advice : Joint Point에 삽입되어 동작할 수 있는 코드
-Weaving : Advice를 핵심 로직코드에 적용하는 것
-Aspect : PointCut + Advice

Spring AOP Advice 종류
-before : 메서드 호출 전에 동작하는 Advice
-after-returning : 예외 없이 호출된 메서드의 동작이 완료되면 동작하는 Advice
-after-throwing : 호출된 메서드 동작 중 예외가 발생했을 때 동작하는 Advice
-after : 예외 발생 여부에 관계없이 호출된 메서드의 동작이 완료되면 동작하는 Advice
-around : 메서드 호출 전과 후에 동작하는 Advice

Spring AOP 구현
-XML을 이용한 구현방법
-@AspectJ 어노테이션을 이용한 구현방법
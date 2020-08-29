package kr.co.jaehyeon.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {

	public void beforeMethod() {
		System.out.println("beforeMethod호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
//	public void aroundMethod() {
//		System.out.println("aroundMethod 호출");
//	}
	
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		//around는 대상 메소드 전과 후에 메소드를 호출 하는 건데, 이 전과후라는 개념이 조금 애매하다.
		//그래서 ProceedingJoinPoint를 통해서 원래 메소드를 호출할 장소를 지정해준다.
		System.out.println("aroundMethod 호출1");
		
		//원래의 메소드를 호출한다.
		Object obj = pjp.proceed();//원래의 메소드가 어떤 값을 반환해줄 수도 있기 때문에 모든 타입의 상위 객체인 Object타입으로 받아줬다.
		
		//또는
//		int a1 = (int) pjp.proceed();이런식으로 값을 받고 싶으면 이렇게 캐스팅을 해줘야함.
//		pjp.proceed();는 object타입만 리턴한다.
		
		System.out.println("aroundMethod 호출2");
		
		return obj;
		//ProceedingJoinPoint를 지정 안해주면, 원래 호출하는 메소드가 호출안되고 aroundMethod가 대신해서 호출된다.
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod호출");
	}
	
	public void afterThrowingMethod(Throwable e1) {	//만들어진 예외 관련된 객체가 e1이라는 매개변수에 자동으로 주입된다.
		System.out.println("afterThrowingMethod호출");
		System.out.println("e1 :" +  e1);
	}
}

package kr.co.jaehyeon.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean2 {

	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
	
	//BeanConfigClass에 initMethod와 destroyMethod를 이용해 생성된 후 메서드와 파괴되기 전 메서드를 정해줄 수도 있지만
	//JSR250라이브러리를 통해 이렇게 bean에 직접 지정해줄 수도 있다.
	
	//생성자 호출 이후 자동으로 호출
	@PostConstruct
	public void init2() {
		System.out.println("TestBean2의 init메서드");
	}
	
	//객체가 소멸되기 전에 자동으로 호출
	@PreDestroy
	public void destroy2() {
		System.out.println("TestBean2의 destroy 메서드");
	}
}

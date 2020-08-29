package kr.co.jaehyeon.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")	//getBean메서드를 호출할 때 마다 새로운 객체를 생성해 반환한다.
public class TestBean4 {
	
	public TestBean4() {
		System.out.println("TestBean4의 생성자");
	}

}

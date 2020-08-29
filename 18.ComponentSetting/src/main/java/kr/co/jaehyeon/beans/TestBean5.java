package kr.co.jaehyeon.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {

	public TestBean5() {
		System.out.println("TestBean5의 생성자");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("TestBean5의 PostConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("TestBean5의 PreDestroy");
	}
}

package kr.co.jaehyeon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jaehyeon.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//beans.xml 파일을 로딩한다
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/jaehyeon/config/beans.xml");
		
		//xml에 정의한 bean 객체의 주소값을 가져온다. 자바 프로젝트의 문제를 해결해준다.
		HelloWorld hello1 = (HelloWorld)ctx.getBean("hello");
		callMethod(hello1);
		
		HelloWorld hello2 = ctx.getBean("hello",HelloWorld.class);	//위와 같은 결과가 나온다.
		callMethod(hello2);
		
		ctx.close();
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}

package kr.co.jaehyeon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jaehyeon.beans.TestBean1;
import kr.co.jaehyeon.beans.TestBean2;

public class MainClass {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/jaehyeon/config/beans.xml");
	
		TestBean1 xml1 = ctx.getBean("xml1",TestBean1.class);
		TestBean2 xml2 = ctx.getBean("xml2",TestBean2.class);
		kr.co.jaehyeon.beans2.TestBean1 xml3 = ctx.getBean("xml3",kr.co.jaehyeon.beans2.TestBean1.class);	//이미 위에 TestBean1이라는 클래스가 있기 때문에 패키지명까지 다 선언을 해주어야 한다.
		
		xml1.method1();
		
		System.out.println("---------------------------");
		xml1.method1(100);
		
		System.out.println("---------------------------");
		xml1.method1("문자열");
		
		System.out.println("----------------------------");
		xml1.method1(100,200);
		
		System.out.println("-------------------------");
		xml1.method1(100, "문자열");
		
		
		System.out.println("---------------------");
		
		xml1.method2();	//관심사로 등록되지 않은 메서드는 advice가 weaving되지 않는다.
		
		System.out.println("--------------------------");

		xml2.method1();
		
		System.out.println("-------------------------");
		
		xml3.method1();
		
		System.out.println("------------------------------");
		
		int a1= xml1.method3();
		System.out.printf("a1 : %d\n",a1);
		
		ctx.close();
	}

}

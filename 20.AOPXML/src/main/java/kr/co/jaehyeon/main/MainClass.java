package kr.co.jaehyeon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jaehyeon.beans.NomalTestClass;
import kr.co.jaehyeon.beans.TestBean;

public class MainClass {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/jaehyeon/config/beans.xml");
		
		TestBean bean1 = ctx.getBean("xml1",TestBean.class);
		
		int a1 = bean1.method1();
		System.out.printf("a1 : %d\n",a1);
		
		method1();
		
		NomalTestClass tc = new NomalTestClass();
		tc.method1();
		
		ctx.close();
	}
	
	public static void method1() {
		System.out.println("메인클래스에서 method1");
	}

}

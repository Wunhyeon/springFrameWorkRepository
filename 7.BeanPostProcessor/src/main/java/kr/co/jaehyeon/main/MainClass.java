package kr.co.jaehyeon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jaehyeon.beans.TestBean1;
import kr.co.jaehyeon.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/jaehyeon/config/beans.xml");
		
		TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
		System.out.printf("t1 : %s\n",t1);
		
		System.out.println("---------------------");
		
		TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
		System.out.printf("t2 : %s\n",t2);
		
		
		ctx.close();
	}

}

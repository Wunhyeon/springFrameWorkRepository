package kr.co.jaehyeon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jaehyeon.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		TestBean obj1 = new TestBean();
		obj1.setData1(100);
		System.out.printf("obj1.data : %d\n",obj1.getData1());
		
		
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/jaehyeon/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.printf("t1.data1 : %d\n", t1.getData1());
		System.out.printf("t1.data2 : %f\n", t1.getData2());
		System.out.printf("t1.data3 : %s\n", t1.isData3());	//boolean값은 getData()가 아니라 isData()로 만들어진다.
		System.out.printf("t1.data4 : %s\n", t1.getData4());
		System.out.printf("t1.data5 : %s\n",t1.getData5());
		System.out.printf("t1.data6 : %s\n",t1.getData6());
		
		ctx.close();
		
		
	}

}

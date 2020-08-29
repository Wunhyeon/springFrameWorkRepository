package kr.co.jaehyeon.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jaehyeon.beans.TestBean1;
import kr.co.jaehyeon.beans.TestBean2;
import kr.co.jaehyeon.beans.TestBean3;
import kr.co.jaehyeon.beans.TestBean4;
import kr.co.jaehyeon.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		//xml을 사용하는 방식
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/jaehyeon/config/beans.xml");
		TestBean1 xml1 = ctx1.getBean("xml1",TestBean1.class);
		System.out.printf("xml1 : %s\n",xml1);
		
		TestBean1 xml11 = ctx1.getBean("xml1",TestBean1.class);
		System.out.printf("xml11 : %s\n",xml11);
		//id가 같은 빈을 가지고 왔다. 싱글톤이기 때문에 똑같은 객체의 주소값을 가지고 온다. 객체생성은 로딩될 때(ctx1을 만들 때) 된다.
		
		System.out.println("-------------------------");
		TestBean2 xml2 = ctx1.getBean("xml2",TestBean2.class);
		System.out.printf("xml2 : %s\n", xml2);
		TestBean2 xml22 = ctx1.getBean("xml2",TestBean2.class);
		System.out.printf("xml22 : %s\n", xml22);
		
		System.out.println("-------------------------");
		
		TestBean3 xml3 = ctx1.getBean("xml3",TestBean3.class);
		System.out.printf("xml3 : %s\n",xml3);
		
		TestBean3 xml33 = ctx1.getBean("xml3",TestBean3.class);
		System.out.printf("xml33 : %s\n", xml33);
		
		System.out.println("------------------------");
		/*
		 * 자바파일에서 bean객체의 주소값을 가져올 때, id를 가지고 주소값을 가지고 왔었다. 근데 사실 이 id는 xml상에 등록되있는
		 * bean들 중에서 똑같은 클래스의 타입의 bean이 여러개가 있을 때 id를 쓰면 된다. 만약에 xml파일 안에 같은 클래스 타입의
		 * bean이 딱 하나만 정의되어 있다고 한다면, 사실 id가 필요가 없다.
		 */
		TestBean4 t4 = ctx1.getBean(TestBean4.class);
		System.out.printf("t4 : %s\n",t4);
		
		
		ctx1.close();
		
		
		System.out.println("====================================");
		//자바파일을 사용하는 방식
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean1 java1 = ctx2.getBean("java1",TestBean1.class);
		System.out.printf("java1 : %s\n",java1);
		
		TestBean1 java11 = ctx2.getBean("java1",TestBean1.class);
		System.out.printf("java11 : %s\n",java11);
		//id가 같은 빈을 가지고 왔다. 싱글톤이기 때문에 똑같은 객체의 주소값을 가지고 온다. 객체생성은 로딩될 때(ctx2 만들때) 된다.
		
		
		//TestBean1 java500 = ctx2.getBean("java500",TestBean1.class);
		TestBean1 java500 = ctx2.getBean("java600",TestBean1.class);
		System.out.printf("java500 : %s\n",java500);
		
		System.out.println("------------------");
		
		TestBean2 java2 = ctx2.getBean("java2", TestBean2.class);
		System.out.printf("java2 : %s\n",java2);
		
		TestBean2 java22 = ctx2.getBean("java2",TestBean2.class);
		System.out.printf("java22 : %s\n",java22);
		
		System.out.println("---------------------");
		
		TestBean3 java3 = ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java3 : %s\n",java3);
		
		TestBean3 java33 = ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java33 : %s\n",java33);
		
		System.out.println("------------------------");
		
		TestBean4 java4 = ctx2.getBean(TestBean4.class);
		System.out.printf("java4 : %s\n",java4);
		
		
		ctx2.close();
		

	}

}

package kr.co.jaehyeon.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.jaehyeon.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	//BeanFactory	- 패키지 내부
	public static void test1() {
		ClassPathResource res = new ClassPathResource("kr/co/jaehyeon/config/beans.xml");
		XmlBeanFactory factory  = new XmlBeanFactory(res);
		//xml을 로딩할 때 객체생성되지 않고 getBean메소드 호출해서 객체를 가지고 올 때 객체가 생성이 된다.
		
		  TestBean t1 = factory.getBean("t1",TestBean.class); 
		  System.out.printf("t1 : %s\n",t1);
		  
		  //같은 아이디를 가지고 있는 bean객체를 받아오면 또다시 객체가 생성이 되는지 실험
		  TestBean t2 = factory.getBean("t1",TestBean.class);
		  System.out.printf("t1 : %s\n",t2);
		  
		  //결과 : 생성자는 한번만 호출이 되고, 같은 객체를 불러온다. 
			/*
			 * 아이디가 t1인 빈 객체를 가져올 때, 객체가 만들어져 있는 상태가 아니라고 한다면, 객체를 생성하고 주소값을 받고, 그걸 버리지 않고
			 * 가지고 있는다. 만들어진 객체를 IoC컨테이너가 보관한다. 그 다음에 필요할 때 (beans.xml에서)같은 아이디를 가지고 있는 객체를
			 * 가지고 오면, 이미 생성된 객체 주소값을 받아다가 사용을 할수가 있다.
			 */
	}
	
	//BeanFactory - 패키지 외부
	public static void test2() {
		//패키지 안에 있는 거를 쓸 때는 ClassPathResource, 패키지 바깥에 있는 거를 쓸 때는 FileSystemResource
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t2",TestBean.class);
		System.out.printf("t1 : %s\n",t1);
		
		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n",t2);
	}
	
	//ApplicationContext - 패키지 내부
	public static void test3() {
		//패키지안에 있는 xml을 가지고 작업을 할 때
		
		//1.xml파일을 로딩해줌
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/jaehyeon/config/beans.xml");
		
		/*
		 * 생성자가 호출된다. ClassPathXmlApplicationContext는 다른 설정을 해주지 않으면, beans.xml에 정의되어 있는
		 * bean객체들이 자동으로 생성된다. 근데 이건 조절가능하다. getBean()메소드를 호출할 때 객체를 생성하게 만들 수도 있고, 자동으로
		 * 생성되게 만들 수도 있다. 지금은 별다른 설정을 하지 않았기 때문에, xml을 로딩 하자마자 객체가 만들어 지게 된다. 그래서 이미
		 * 만들어져 있는 객체의 주소값을 받아다가 사용한다.
		 */
		
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.printf("t1 : %s\n",t1);
		//똑같은 아이디의 객체를 가지고 와보면 같은 객체의 주소값이 나온다.
		TestBean t2 = ctx.getBean("t1",TestBean.class);
		System.out.printf("t2 : %s\n",t1);
		
		ctx.close();
	}
	
	//ApplicationContext = 패키지 외부
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean t1 = ctx.getBean("t2",TestBean.class);
		System.out.printf("t1 : %s\n",t1);
		
		TestBean t2 = ctx.getBean("t2",TestBean.class);
		System.out.printf("t2 : %s\n",t1);
		
		ctx.close();
	}

}

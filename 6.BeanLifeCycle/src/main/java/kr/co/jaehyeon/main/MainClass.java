package kr.co.jaehyeon.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jaehyeon.beans.TestBean1;
import kr.co.jaehyeon.beans.TestBean2;
import kr.co.jaehyeon.beans.TestBean3;
import kr.co.jaehyeon.beans.TestBean4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//xml파일을 로딩하는 부분을 만듬. 이때, xml파일에 정의되어 있는 bean들 중에서, 아무것도 설정이 되어있지 않은 bean들은 singleTon이기 때문에 바로
		//객체가 생성이 되고, lazy-init에 true 값을 넣어줬다고 한다면, xml을 로딩할 때 바로 객체가 생성이 되는 것이 아니라, getBean()메소드로 호출할 때
		//객체가 생성이 된다. 이 이후로 같은 id를 가지고 있는 bean을 가지고 오면 또다시 객체가 생성이 되지는 않는다.
		//그런데 scope에 prototype을 넣어주게 되면 해당 객체는 prototype이기 때문에 해당 객체는 xml을 로딩할 때 객체가 생성되지 않고,
		//getBean()메소드로 호출할 때 마다 객체가 새로 생성이 된다.(singleTon아님)
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/jaehyeon/config/beans.xml");
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.printf("t1 : %s\n",t1);
		
		
		
		
		System.out.println("-------------------------");
		
		TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
		System.out.printf("t2 : %s\n",t2);
		
		System.out.println("--------------------------");
		
		TestBean3 t3 = ctx.getBean("t3",TestBean3.class);
		System.out.printf("t3 : %s\n",t3);
		
		System.out.println("-----------------------------");
		
		TestBean4 t4 = ctx.getBean("t4",TestBean4.class);
		System.out.printf("t4 : %s\n",t4);
		
		
		
		System.out.println("---------------------------");
		ctx.close();	//IoC컨테이너를 닫는 메소드. 이때 IoC컨테이터가 가지고 있는 모든 bean객체들이 소멸된다.
		
	}

}

package kr.co.jaehyeon.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.jaehyeon.beans.DataBean1;
import kr.co.jaehyeon.beans.DataBean2;
import kr.co.jaehyeon.beans.DataBean3;
import kr.co.jaehyeon.beans.TestBean1;
import kr.co.jaehyeon.beans.TestBean2;
import kr.co.jaehyeon.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1(200, "문자열2", new DataBean1());	//생성자에 주입하는 법
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		t1.setData1(400);		//setter에 주입하는 법
		t1.setData2("문자열4");
		t1.setData3(new DataBean1());
		
		return t1;
	}
	
	@Bean
	public DataBean2 data1() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean2 java3() {		//이름을 통한 자동주입. TestBean2클래스에 data1, data2의 getter메소드가 있다. 이 메소드들에 위의 두개 메소드 (data1, data2)를 자동주입해준다.
		return new TestBean2();
	}
	
	@Bean
	public DataBean3 data100() {
		return new DataBean3();
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public TestBean3 java4() {		//타입을 통한 자동주입. TestBean3클래스에 DataBean3을 받는 getter메소드 들이 있다. 이 메소드들에 위의 DataBean3을 린턴하는 data100메소드를 자동 주입해준다.
		return new TestBean3();
	}

}

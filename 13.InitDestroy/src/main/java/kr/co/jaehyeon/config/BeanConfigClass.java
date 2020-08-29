package kr.co.jaehyeon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.jaehyeon.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	
	@Bean(initMethod = "init",destroyMethod = "destroy")
	@Lazy
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}

}

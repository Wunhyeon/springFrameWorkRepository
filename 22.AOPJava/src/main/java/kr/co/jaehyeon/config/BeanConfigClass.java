package kr.co.jaehyeon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"kr.co.jaehyeon.beans","kr.co.jaehyeon.advisor"})
@EnableAspectJAutoProxy	//advisor 클래스에 설정되어 있는 Annotation을 분석하여 AOP세팅을 해라
public class BeanConfigClass {

}

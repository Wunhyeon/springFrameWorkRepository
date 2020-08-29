package kr.co.jaehyeon.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {

	private int data1;
	private DataBean1 data2;
	
	//자동주입을 변수에 설정한다.
	//자동으로 setter 메서드가 추가되어 setter 메서드를 통해 주입받게 된다.
	@Autowired
	private DataBean1 data3;
	
	public DataBean1 getData3() {
		return data3;
	}
	
	@Autowired
	@Qualifier("obj4")
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	@Autowired(required = false)	//이 bean이 있으면 주입이 되고, 없으면 말고. 없으면 null값 들어감. Autowired만 있으면 반드시 주입이 되어야 한다. 만약 그 bean이 없으면 오류발생
	@Qualifier("obj6")
	private DataBean2 data6;
	
	public DataBean2 getData6() {
		return data6;
	}

	
	
	
	public int getData1() {
		return data1;
	}

	//필수 주입 프로퍼티(스프링 5.1부터 혹은 자바 파일로 bean을 등록했을 경우 무시된다)
	@Required	
	public void setData1(int data1) {
		this.data1 = data1;
	}
	/*
	 * 스프링 5버전 전까지는 Required어노테이션이 붙은 빈에 주입하지 않으면 오류가 발생했지만 5버전 이후로 안쓰는 어노테이션이 되어
	 * 오류가 발생하지 않는다. 반드시 주입해야 할 프로퍼티가 있다면 생성자를 통해 주입하도록 하고 있다.
	 */

	public DataBean1 getData2() {
		return data2;
	}
	
	//자동주입(타입)
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}
	
	/*
	 * Autowired만 붙여주면 클래스타입으로 주입해주기 때문에 매개변수(DataBean1)가 bean을 설정해주는 파일에서
	 * (BeanConfigClass) 반드시 DataBean1타입을 반환해주는 bean이 있어야 한다. 만약에 이 타입의 bean이 정의되어
	 * 있지 않다면 오류가 발생한다.
	 */
	
	
}
package kr.co.jaehyeon.beans;

import org.springframework.beans.factory.annotation.Value;

public class TestBean2 {
	
	private int data1;
	private String data2;
	private DataBean3 data3;
	private DataBean4 data4;
	
	//주입에 관한 걸 아무것도 세팅하지 않고, 그냥 생성자를 만들어 놓았을 뿐이다. 근데 beans.xml에다가 <context:annotation-config>를 설정을 했기 때문에
	//이 bean의 생성자의 타입을 보고 이 타입과 일치하는 빈을 찾아다가 자동으로 주입을 해주게 된다.
	//기본자려형의 경우 주입할 값을 직접 지정해주면 된다.(밑의 생성자)
	/*
	 * public TestBean2(DataBean3 data3, DataBean4 data4) {
	 * 
	 * this.data3 = data3; this.data4 = data4; }
	 */
	public TestBean2() {
		
	}
	
	
	public TestBean2(@Value("100")int data1,@Value("문자열") String data2, DataBean3 data3, DataBean4 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}

	public int getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean4 getData4() {
		return data4;
	}
	
	

}

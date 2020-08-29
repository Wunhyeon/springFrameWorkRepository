package kr.co.jaehyeon.beans;

import javax.annotation.Resource;


public class TestBean6 {
	
	@Resource(name = "data1")	//bean의 이름과 다를 경우에. @Autowired @Qualifier("data1")를 합쳐놓은 것과 같다.
	private DataBean1 data100;
	
	@Resource(name = "data2")
	private DataBean2 data200;

	public DataBean1 getData100() {
		return data100;
	}

	public DataBean2 getData200() {
		return data200;
	}
	
	

}

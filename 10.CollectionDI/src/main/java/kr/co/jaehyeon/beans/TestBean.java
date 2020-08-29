package kr.co.jaehyeon.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestBean {
	
	private List<String> list1;
	/*
	 * 기본자료형을 가진 리스트. 자바에서는 기본자료형 값은 Collection에 담지 못한다. 그래서 Wrapper클래스를 이용한다.
	 * https://hyeonstorage.tistory.com/168
	 * https://coding-factory.tistory.com/547
	 * https://hackersstudy.tistory.com/26
	 * https://m.blog.naver.com/PostView.nhn?blogId=jang_delay&logNo=220700072598&proxyReferer=https:%2F%2Fwww.google.com%2F
	 */
	private List<Integer> list2;
	
	private List<DataBean> list3;
	
	/*
	 * set은 중복된 값을 갖지 못한다. 그리고 객체는 클래스 타입이 같은게 아니라 객체의 주소값이 같은거 즉, 같은 객체 주소값은 들어가지
	 * 못한다.
	 */
	
	private Set<String> set1;
	private Set<Integer> set2;
	private Set<DataBean> set3;
	
	private Map<String, Object> map1;
	
	private Properties prop1;
	
	
	public Set<String> getSet1() {
		return set1;
	}

	public void setSet1(Set<String> set1) {
		this.set1 = set1;
	}

	public Set<Integer> getSet2() {
		return set2;
	}

	public void setSet2(Set<Integer> set2) {
		this.set2 = set2;
	}

	public Set<DataBean> getSet3() {
		return set3;
	}

	public void setSet3(Set<DataBean> set3) {
		this.set3 = set3;
	}

	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public List<Integer> getList2() {
		return list2;
	}

	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}

	public List<DataBean> getList3() {
		return list3;
	}

	public void setList3(List<DataBean> list3) {
		this.list3 = list3;
	}

	public Map<String, Object> getMap1() {
		return map1;
	}

	public void setMap1(Map<String, Object> map1) {
		this.map1 = map1;
	}

	public Properties getProp1() {
		return prop1;
	}

	public void setProp1(Properties prop1) {
		this.prop1 = prop1;
	}
	
	
	
	

}

package kr.co.jaehyeon.beans;

public class TestBean1 {
	
	public void method1() {
		System.out.println("beans.TestBean1.method1()");
	}
	
	public void method1(int a1) {
		System.out.println("beans.TestBean1.method1(int a1)");
	}
	
	public void method1(String a2) {
		System.out.println("beans.TestBean1.method1(java.lang.String a2)");
	}
	
	public void method1(int a1, int a2) {
		System.out.println("beans.TestBean1.method1(int a1, int a2)");
	}
	
	public void method1(int a1, String a2) {
		System.out.println("beans.TestBean1.method1(int, java.lang.String)");
	}
	
	
	public void method2() {
		System.out.println("beans.TestBean1.method2()");
	}
	
	public int method3() {
		System.out.println("int beans.TestBean1.method3()");
		return 100;
	}

}

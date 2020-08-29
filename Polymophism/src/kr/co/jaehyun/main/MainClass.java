package kr.co.jaehyun.main;

import kr.co.jaehyun.beans.HelloWorld;
import kr.co.jaehyun.beans.HelloWorldEn;
import kr.co.jaehyun.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello1 = new HelloWorldEn();
		callMethod(hello1);
		
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}

package kr.co.jaehyun.main;

import kr.co.jaehyun.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorldEn hello1 = new HelloWorldEn();
		callMethod(hello1);

		HelloWorldEn hello2 = new HelloWorldEn();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorldEn hello) {
		hello.sayHello();
	}

}

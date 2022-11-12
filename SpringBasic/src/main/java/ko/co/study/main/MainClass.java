package ko.co.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ko.co.study.beans.HelloWorld;

public class MainClass {
	public static void main(String[] args) {
		 // beans.xml 파일을 로딩한다.
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ko/co/study/config/beans.xml");
		 
		 // xml에 정의한 bean 객체의 주소값을 가져온다.
		 HelloWorld hello1 = (HelloWorld)ctx.getBean("hello");
		 callMethod(hello1);
		 
		 HelloWorld hello2 = ctx.getBean("hello", HelloWorld.class);
		 callMethod(hello2);
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
 

}
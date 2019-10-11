package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("demo.xml");
		Manager m=ac.getBean("com", Manager.class);
		System.out.println(m);
	}

}

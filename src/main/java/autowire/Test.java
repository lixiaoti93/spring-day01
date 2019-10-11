package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
			ApplicationContext ac=new ClassPathXmlApplicationContext("autowire.xml");
			Car car=ac.getBean("car", Car.class);
			System.out.println("car:"+car);
			
		
	
	}

}

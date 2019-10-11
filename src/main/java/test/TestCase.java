package test;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowire.Car;
import basic.MessageService;
import basic.ScopeBean;
import demo.ExampleBean;
import ioc.A;
import ioc.Restaurant;
import value.SpelBean;
import value.ValueBean;
import value.SpelBean;

public class TestCase {
	@Test
	public void test1() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("basic.xml");
		ScopeBean sb1=ac.getBean("sb1", ScopeBean.class);
		ScopeBean sb2=ac.getBean("sb1", ScopeBean.class);
		System.out.println(sb1==sb2);

	}
	@Test
	public void test2() {
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("basic.xml");
		MessageService ms1=ac.getBean("ms1",MessageService.class);
		ms1.sendMessage();
		/*
		 * 关闭容器。
		 * ApplicationContext接口没有提供关闭容器的方法。
		 */
		ac.close();

	}
	@Test
	//测试延迟加载
	public void test3() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("basic.xml");
		

	}
	@Test
	//测试延迟加载
	public void test4() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ioc.xml");
		A a1=ac.getBean("a1",A.class);
		a1.service();
		
	
		


}
	@Test
	public void test5() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ioc.xml");
		Restaurant rest=ac.getBean("rest1", Restaurant.class);
		System.out.println("rest:"+rest);
		

}
	@Test
	public void test6() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("autowire.xml");
		Car car=ac.getBean("car", Car.class);
		System.out.println("car:"+car);
		
}
	@Test
	public void test7() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("value.xml");
		ValueBean vb1=ac.getBean("vb1", ValueBean.class);
		System.out.println("vbi:"+vb1);
}
	@Test
	public void test8() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("value.xml");
		ValueBean vb2=ac.getBean("vb2", ValueBean.class);
		System.out.println("vb2:"+vb2);
}
	@Test
	//测试读取properties的内容
	public void test9() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("value.xml");
		System.out.println(ac.getBean("config"));
}
	@Test
	public void test10() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("example.xml");
		ExampleBean exam=ac.getBean("exam", ExampleBean.class);
		System.out.println("exam:"+exam);
}
	@Test
	public void test11() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("example.xml");
		System.out.println(ac.getBean("config"));
}
	@Test
	public void test12() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("value.xml");
		SpelBean sb1=ac.getBean("sb1", SpelBean.class);
		System.out.println("sb1:"+sb1);
	
}
	@Test
	public void test13() throws SQLException {
		ApplicationContext ac=new ClassPathXmlApplicationContext("exec.xml");
		BasicDataSource ds=ac.getBean("ds",BasicDataSource.class);
		System.out.println(ds.getConnection());
	
}
	 
	
	
	
	
	
}

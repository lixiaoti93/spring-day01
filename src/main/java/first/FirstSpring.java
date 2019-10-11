package first;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {

	public static void main(String[] args) {
		/**
		 * 启动Spring容器.
		 * ApplicationContext是一个接口，定义了Spring容器的基本功能。
		 * ClassPathXmlApplicationContext是一个实现了ApplicationContext接口的类，
		 * 该类会根据类路径来查找Spring配置文件，然后启动容器。
		 */
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*System.out.println("ac:"+ac);
		Student stu=ac.getBean("stu1",Student.class);
		System.out.println("stu:"+stu);
		Date date=ac.getBean("date1",Date.class);
		System.out.println("date:"+date);
*/
		/*Calendar cal1=ac.getBean("cal1", Calendar.class);
		System.out.println("cal1:"+cal1);*/
		Date date=ac.getBean("time1",Date.class);
		System.out.println("date:"+date);
	}

}
 
package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp 
{
	public static void main(String[] args) 
	{
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		 System.out.println(theCoach.getDailyWorkout());
		 System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}

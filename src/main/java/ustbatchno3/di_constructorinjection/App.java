package ustbatchno3.di_constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Roles r = context.getBean("setter", Roles.class);
		r.display();
    }
}

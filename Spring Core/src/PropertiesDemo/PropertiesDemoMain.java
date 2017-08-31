package PropertiesDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesDemoMain {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("propertiesDemo.xml");
		IceCream ic1 = (IceCream) context.getBean("iceBean");
		ic1.displayFlavour();
		
				
		((AbstractApplicationContext)context).registerShutdownHook();
		
	}

}


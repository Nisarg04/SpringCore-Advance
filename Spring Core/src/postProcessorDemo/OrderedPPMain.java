package postProcessorDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderedPPMain {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("configP.xml");
		IceCream ic1 = (IceCream) context.getBean("iceBean");
		ic1.setFlavour("Vanilla");
		ic1.displayFlavour();
		
				
		((AbstractApplicationContext)context).registerShutdownHook();
		
	}

}


package beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("scopeConfig.xml");
		IceCream ic1 = (IceCream) context.getBean("iceBean");
		ic1.setFlavour("Vanilla");
		ic1.displayFlavour();
		
		IceCream ic2 = (IceCream) context.getBean("iceBean");
		ic2.displayFlavour();
		
	}

}

/* When you set the bean scope as singleton, even when you get the bean for the second time
that is ic2, the flavour will still be the same as ic1, because a new bean is not created.abstract
However, if you set the scope as prototype, the second output's flavour will be 
null, as a new bean got created and by default its flavour got set to null, as we did not
set any value for the flavour in ic2. */
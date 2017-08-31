package lifeCycle3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class IceCream implements InitializingBean, DisposableBean{

	String flavour;

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public void displayFlavour()
	{
		System.out.println("Your selected flavour is : "+flavour);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After properties set called");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method called");
		
	}
	
	
}

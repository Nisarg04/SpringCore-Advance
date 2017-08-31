package lifeCycle2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class IceCream {

	String flavour;

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public void displayFlavour()
	{
		System.out.println("Your selected flavour is : "+flavour);
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Bean has been created");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Bean will now be destroyed");
	}
	
}

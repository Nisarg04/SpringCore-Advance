package postProcessorDemo;



public class IceCream {

	String flavour;

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public void displayFlavour()
	{
		System.out.println("Your selected flavour is : "+flavour);
	}

	public void initBean()
	{
		System.out.println("Bean has been created");
	}
	
	public void destroyBean()
	{
		System.out.println("Bean will now be destroyed");
	}
	
	
}

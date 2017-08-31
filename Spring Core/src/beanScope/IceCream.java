package beanScope;

public class IceCream {

	String flavour;

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public void displayFlavour()
	{
		System.out.println("Your selected flavour is : "+flavour);
	}
	
}

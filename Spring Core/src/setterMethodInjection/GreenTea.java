package setterMethodInjection;


public class GreenTea implements ITea {
	
	@Override
	public void prepareTea() {
		System.out.println("Preparing Green Tea...inside GreenTea class");
		
	}

}

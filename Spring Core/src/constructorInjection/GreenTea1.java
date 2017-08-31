package constructorInjection;


public class GreenTea1 implements ITea1 {
	
	@Override
	public void prepareTea() {
		System.out.println("Preparing Green Tea...inside GreenTea class");
		
	}

}

package constructorInjection;


public class Tea1 implements ITea1 {

	@Override
	public void prepareTea() {
		System.out.println("Preparing Tea...inside tea class");
		
	}
	
	

}

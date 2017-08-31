package constructorInjection;



public class Restaurant1 {

	ITea1 teaobj;
	
	public Restaurant1(ITea1 teaobj) {
		this.teaobj = teaobj;
	}

	public void prepareDrink()
	{
		teaobj.prepareTea();
	}
	
	
}

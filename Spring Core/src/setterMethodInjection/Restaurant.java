package setterMethodInjection;



public class Restaurant {

	ITea teaobj;
	
	public void setTeaobj(ITea teaobj) {
		this.teaobj = teaobj;
	}

	public void prepareDrink()
	{
		teaobj.prepareTea();
	}
	
	
}

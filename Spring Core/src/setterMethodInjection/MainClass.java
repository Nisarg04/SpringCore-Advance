package setterMethodInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Restaurant restObj = (Restaurant) context.getBean("restaurantBean");
		
		restObj.prepareDrink();

	}

}

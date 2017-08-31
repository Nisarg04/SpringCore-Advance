package constructorInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		
		Restaurant1 restObj = (Restaurant1) context.getBean("restaurantBean1");
		
		restObj.prepareDrink();

	}

}

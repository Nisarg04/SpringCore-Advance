package collectionDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollectionClass {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
		Student stu = (Student)context.getBean("studentBean");
		stu.displayList();

	}

}

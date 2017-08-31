package BeanFactoryPostProcessorDemo;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


public class DemoBFPP implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		
		BeanDefinition bdf = beanFactory.getBeanDefinition("iceBean");
		MutablePropertyValues mpv = bdf.getPropertyValues();
		mpv.addPropertyValue("flavour","New Flavour : Chocolate");
		
	}

}

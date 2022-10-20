package app.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("herzel")
public class MyBean implements BeanNameAware, InitializingBean {
	
	private String myBeanName;
	@Value("${home.address}")
	private String homeAddress;
	
	{
		System.out.println("\t>>>MyBean instanciate: " + myBeanName);
		System.out.println("\t>>>MyBean instanciate: " + homeAddress);
	}

	@Override
	public void setBeanName(String name) {
		this.myBeanName = name;
	}

	public String getMyBeanName() {
		return myBeanName;
	}

	@PostConstruct
	public void myInitMethod() {
		System.out.println("\t@PostConstruct: " + this.myBeanName + " is ready");
		System.out.println("\t@PostConstruct: " + this.homeAddress);
	}
	
	@PreDestroy
	public void myDestroyMethod() {
		System.out.println("\t@PreDestroy: " + this.myBeanName + " is destroid");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("\tInitializingBean: " + this.myBeanName + " is ready");
		System.out.println("\tInitializingBean: " + this.homeAddress);
		
	}
	
	

}

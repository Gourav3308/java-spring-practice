package in.gm.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//public class Student implements BeanNameAware{

	public class Student implements ApplicationContextAware{
	private String name;
	private String rollno;
	private Address address;
	//private String beanName;
	//private BeanFactory beanFactory;
	private ApplicationContext applicationContext;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public void display() {
		System.out.println("Name :"+ name);
		System.out.println("Rollono :"+ rollno);
		//System.out.println("BeanName :"+ beanName);
		
	    Address address= (Address) applicationContext.getBean("addobj");
		System.out.println("Address :" + address);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	this.applicationContext=applicationContext;
		
	}
	
	
	
	// BeanNameAware
	
//	@Override
//	public void setBeanName(String beanName) {
//		this.beanName=beanName;
//	}
	
	
	
	
	//  BeanFactoryAware
	
//	@Override
//	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//		
//		this.beanFactory=beanFactory;
//					
//		
//	}
	
	
	

}

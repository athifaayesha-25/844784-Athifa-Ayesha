package spring;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Employee_JdbcTemplate1;
public class SpringMain {
	/*
	 //ApplicationContext--Central interface to
	 *provide configuration for an application.
	 *This is read-only while the
	 *application is running
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("SpringConfig.xml");
		//detect bean object
		FirstBean myBean=(FirstBean)beanFactory.getBean("Bean1");//bean object
		myBean.display();
		
		//using annotation--no xml file
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AnnoBean1.class);
		AnnoBean myBean1=(AnnoBean)context.getBean("SpringAnnoBean");//bean object
		myBean1.disp("Athifa");
		
		EmployeeBean myBean2=(EmployeeBean)beanFactory.getBean("myemployee1");//bean object
		myBean2.show();
		
		//abstract class cannot be instantiated
		//Student h1=(Student)beanFactory.getBean("stud");
		Student_Course sc1=(Student_Course)beanFactory.getBean("course1");
		System.out.println(sc1.getSid());
		System.out.println(sc1.getName());
		System.out.println(sc1.getCid());
		System.out.println(sc1.getCname());
		
		
		User_properties myBean11=(User_properties)beanFactory.getBean("prop1");//bean object
		System.out.println(myBean11.getUser()+" "+myBean11.getRole()+" "+myBean11.getEmail());
		
		
		System.out.println("REF TAG(WITHOUT AUTOWIRE");
		Bank myBean4=(Bank)beanFactory.getBean("bank_aw");//bean object
		System.out.println(myBean4.getBankname());
		System.out.println(myBean4.getMgrname());
		System.out.println(myBean4.getB1().getCity());
		System.out.println(myBean4.getB1().getState());
		
		
		System.out.println("AUTOWIRE(WITHOUT REG TAG):");
		Bank myBean5=(Bank)beanFactory.getBean("bank_aw1");//bean object
		System.out.println(myBean5.getBankname());
		System.out.println(myBean5.getMgrname());
		System.out.println(myBean5.getB1().getCity());
		System.out.println(myBean5.getB1().getState());
				
		
		System.out.println("AUTOWIRE(CONSTRUCTOR):");
		EmployeeBean myBean3=(EmployeeBean)beanFactory.getBean("myemployee2");//bean object
		myBean3.show();
		
		System.out.println("AUTOWIRE ANNOTATION:");
		Bank_AutoWire myBean31=(Bank_AutoWire)beanFactory.getBean("anno1");//bean object
		System.out.println(myBean31.getBankname());
		System.out.println(myBean31.getMgrname());
		System.out.println(myBean31.getB20().getCity());
		System.out.println(myBean31.getB20().getState());
		
		
		System.out.println("Collection-Setter Injection");
		Vendor_Collection q=(Vendor_Collection)beanFactory.getBean("obj1");
		q.displayinfo();
		
		
		System.out.println("Collection-Dependent Object Injection::");
		Training_Collection q1=(Training_Collection)beanFactory.getBean("tco1");
		q1.displayinfo();
		
		
		
		System.out.println("Map Collection-Setter Injection");
		Assessment_MapCollection q12=(Assessment_MapCollection)beanFactory.getBean("asmap1");
		q12.display();	
		
		
		
		System.out.println("Collection-constructor Injection");
		Vendor1_Collect q3=(Vendor1_Collect)beanFactory.getBean("obj11");
		q3.displayinfo1();
		
		
		
		
		Employee_JdbcTemplate1 s=(Employee_JdbcTemplate1)beanFactory.getBean("mydatabase");
		System.out.println("SPRING+JDBC:::");
		List<Employee_Jdbc> e1=s.listemp();
		System.out.println("ENO          NAME          SALARY");
		for(Employee_Jdbc rec:e1)
		{
			System.out.println(rec.getEmp_eno()+" ");
			System.out.println(rec.getEmp_name()+" ");
			System.out.println(rec.getSalary()+" ");
		}
		
		
		
		//no xml and no separate spring configuration class file
		SpringAnno_Component myBean6=(SpringAnno_Component)
				beanFactory.getBean("SpringAnnotationNew");//bean object
		System.out.println(myBean6.Training+" "+myBean6.loc);
			
	}
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("SpringConfig.xml");
		//detect bean object
		FirstBean myBean=(FirstBean)beanFactory.getBean("Bean1");//bean object
		myBean.display();

	}

}

package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //similar to calling xml
public class AnnoBean1 {
	//similar to id
	@Bean(name="SpringAnnoBean")
	public AnnoBean callbean()
	{
		return new AnnoBean();
	}
	

}

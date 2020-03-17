package spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//NO XML FILE AND NO BEAN OBJECT CLASS
@Component("SpringAnnotationNew")
public class SpringAnno_Component {
	//inject the value to the variable
	@Value("SpringFramework")
	String Training;
	@Value("Chennai")
	String loc;
	public String getTraining() {
		return Training;
	}
	public void setTraining(String training) {
		Training = training;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}

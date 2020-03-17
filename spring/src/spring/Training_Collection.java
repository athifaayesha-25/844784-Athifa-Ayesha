package spring;

import java.util.Iterator;
import java.util.List;

public class Training_Collection {
	int batchno;
	String projectname;
	List<Technology_coll>tc1;//3rd party object
	public int getBatchno() {
		return batchno;
	}
	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public List<Technology_coll> getTc1() {
		return tc1;
	}
	public void setTc1(List<Technology_coll> tc1) {
		this.tc1 = tc1;
	}
	public void displayinfo()
	{
		System.out.println(batchno+" "+projectname);
		System.out.println("Technology Trainings: ");
		Iterator<Technology_coll> itr=tc1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}	
	

}

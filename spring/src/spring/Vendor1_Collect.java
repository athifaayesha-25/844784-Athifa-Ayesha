package spring;

import java.util.Iterator;
import java.util.List;

public class Vendor1_Collect {
	int vid1;
	String vendorname1;
	List<String>cus_name1; //generics
	public Vendor1_Collect(int vid1, String vendorname1, List<String> cus_name1) {
		super();
		this.vid1 = vid1;
		this.vendorname1 = vendorname1;
		this.cus_name1 = cus_name1;
	}
	public void displayinfo1()
	{
		System.out.println(vid1+" "+vendorname1);
		System.out.println("Customers Are: ");
		Iterator<String> itr=cus_name1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}	
	
	
	

}

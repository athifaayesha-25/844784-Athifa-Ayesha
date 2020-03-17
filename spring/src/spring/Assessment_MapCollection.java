package spring;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//MAP COLLECTION SETTER INJECTION
public class Assessment_MapCollection {
	int sid;
	String sname;
	//generics==key,value
	Map<String,String>test_details;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Map<String, String> getTest_details() {
		return test_details;
	}
	public void setTest_details(Map<String, String> test_details) {
		this.test_details = test_details;
	}
	public void display()
	{
		System.out.println("Sid:"+sid);
		System.out.println("Entry<K, V>:"+sname);
		Set<Entry<String,String>>set=test_details.entrySet();
		Iterator<Entry<String,String>>itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<String,String>entry=itr.next();
			System.out.println("Test_List:"+entry.getKey()+"Affended??:"+entry.getValue());
		}	
	}
}

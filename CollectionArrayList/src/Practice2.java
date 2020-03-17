import java.util.ArrayList;
import java.util.HashMap;

//import java.util.ArrayList;
//import java.util.HashMap;

public class Practice2
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] s1={"goa","kerala","gujarat"};
		//putValues(s1);
		
		//String[] s1={"goa","kerala","gujarat"};
		// putvalues(s1);
		
		String s1[]={"athifa","ayesha","suparna"};
		putValues(s1);

	}
	//public static void putValues(String[] s1)
	//{
		/*ArrayList<String> l1=new ArrayList<String>();
		HashMap<String,String> m1=new HashMap<String,String>();
		ArrayList<String> l2=new ArrayList<String>();
		for(String s:s1)
		{
			l1.add(s.toUpperCase().substring(0,3));
		}
		for(String s:s1)
		{
			l2.add(s);
		}
		for(int i=0;i<l1.size();i++)
		{
			m1.put(l1.get(i), l2.get(i));
		}
		System.out.println(m1);
		*/
		/* public static void putvalues(String[] s1) {
		 ArrayList<String> l1=new ArrayList<String>();
		 HashMap<String,String> m1=new HashMap<String,String>();
		 ArrayList<String> l2=new ArrayList<String>();
		 for(String s:s1)
		  l1.add(s.toUpperCase().substring(0, 3));
		 for(String s:s1)
		  l2.add(s); 
		 for(int i=0;i<l1.size();i++)
		  m1.put(l1.get(i),l2.get(i)); 
		 System.out.println(m1);*/

	public static void putValues(String[] s1) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<String>();
		HashMap<String,String> m1=new HashMap<String,String>();
		ArrayList<String> l2=new ArrayList<String>();
		for(String s:s1){
			l1.add(s.toUpperCase().substring(0,3));
		}
		for(String s:s1)
		{
			l2.add(s);
		}
		for(int i=0;i<l1.size();i++){
			m1.put(l1.get(i), l2.get(i));
		}
		System.out.println(m1);
		
		
	}
	}	


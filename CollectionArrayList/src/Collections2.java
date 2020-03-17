/*import java.util.ArrayList;

public class Collections2 {*/
	/*public static String getTheNamesinGivenFormat(String[] ip) {
		 StringBuffer sb=new StringBuffer();
		 for(int i=0;i<ip.length;i++)
		  sb.append(ip[i]).append(',');
		 sb.deleteCharAt(sb.length()-1);
		 return sb.toString();
		}*/
	
	/*public static String getTheNamesinGivenFormat(String[] ip )
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Vikas");
		names.add("Lokesh");
		names.add("Ashok");
		
		for(int i=0;i<ip.length;i++)
			  ((Appendable) names).append(ip[i]).append(',');
		 
	   names.deleteCharAt(names.length() -1);
		 return names.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/* String[] ip={"Vikas","Lokesh","Ashok"};
			 System.out.println(getTheNamesinGivenFormat(ip));*/
		
		/* String[] ip={"Vikas","Lokesh","Ashok"};
		 System.out.println(getTheNamesinGivenFormat(ip));

	}

}*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections2 {
	/*public static String getTheNamesinGivenFormat(String[] ip) {
		 StringBuffer sb=new StringBuffer();
		 for(int i=0;i<ip.length;i++)
		  sb.append(ip[i]).append(',');
		 sb.deleteCharAt(sb.length()-1);
		 return sb.toString();
		}*/
	
	public static String getTheNamesinGivenFormat(String[] ip )
	{
		int i=0;
		List<String> names=new ArrayList<String>(Arrays.asList(ip));
		String s=ip[i].join(",", names);
		return s;
		
		
		
		/*for(int i=0;i<ip.length;i++)
			  ((Appendable) names).append(ip[i]).append(',');
		 
	   names.deleteCharAt(names.size()-1);
		 return names.toString();*/
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/* String[] ip={"Vikas","Lokesh","Ashok"};
			 System.out.println(getTheNamesinGivenFormat(ip));*/
		
		 String[] ip={"Vikas","Lokesh","Ashok"};
		 System.out.println(getTheNamesinGivenFormat(ip));

	}

}

import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;

/*import java.lang.String;
import java.util.*;
import java.util.Scanner;*/


public class String5 {
	/*static final int totalnochars=256;
	static char getMaxCharCountArray(String str)
	{
		int count[]=new int[totalnochars];
		int len=str.length();
		for(int i=0;i<len;i++){
			count[str.charAt(i)]++;
		}
		int max=-1;
		char result=' ';
		for(int i=0;i<len;i++){
			if(max<count[str.charAt(i)]){
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		return result;
	}*/
	/*static final int asciisize=256;
	static char getmaxcountchararray(String str)
	{
		int count[]=new int[asciisize];
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			count[str.charAt(i)]++;
		}
		int max=-1;
		char result=' ';
		for(int i=0;i<len;i++){
			if(max<count[str.charAt(i)]){
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		return result;
	}*/
	
	

	/*static final int asciisize=256;
	static char getmaxcountcharArray(String str){
		int count[]=new int[asciisize];
		int len=str.length();
		for(int i=0;i<len;i++){
			count[str.charAt(i)]++;
		}
		int max=-1;
		char result=' ';
		for(int i=0;i<len;i++){
			if(max<count[str.charAt(i)]){
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		System.out.println(max);
		return result;
		
	}*/
	
	
	static final int asciisize=256;
	static char getmaxcountchararray(String str)
	{
		int count[]=new int[asciisize];
		int len=str.length();
		
		for(int i=0;i<len;i++){
			count[str.charAt(i)]++;
		}
		int max=-1;
		char result=' ';
		for(int i=0;i<len;i++){
			if(max<count[str.charAt(i)]){
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the input string");
		String str=sc.next();
		System.out.println("the maximum count of a characters in a string are= "+getMaxCharCountArray(str));*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the input string");
		String s=sc.next();
		System.out.println("the maximum count of number of characters are= "+getmaxcountchararray(s));*/
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the input string");
		String s=sc.nextLine();
		System.out.println("the maximun count of number of repeated characters are: "+getmaxcountcharArray(s));*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input String");
		
	    String s=sc.nextLine();
	  
	    System.out.println("the maximum count of number of characters is= "+getmaxcountchararray(s));
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}

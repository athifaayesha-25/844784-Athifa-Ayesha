import java.lang.String;
import java.util.*;
public class String4 {
static final int noofchars=256;
static char Count[]=new char[noofchars];
static void getCountcharArray(String str)
{
	for(int i=0;i<str.length();i++){
		Count[str.charAt(i)]++;
		}
}
static int firstNonRepeating(String str){
	getCountcharArray(str);
	int index=-1,i;
	for(i=0;i<str.length();i++)
	{
		if(Count[str.charAt(i)]==1)
		{
			index=i;
			break;
		}
	}
	return index;
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int index=firstNonRepeating(str);
		System.out.println(index);
   
	}

}

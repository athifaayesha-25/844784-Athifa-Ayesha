public class STester4 
{ 
public static void main(String[] args) 
{
 String str = "java"; 

StringBuffer sb = new StringBuffer("java"); 
sb.insert(9, "programming"); 
str.concat(s2); 
 
if (sb.length() < 6 || str.equals("java")) {
System.out.println(sb); }
 sb.delete(2, 7);
 System.out.println(sb);
 } }


/* Output: If we want to insert the String "Programmin" at 9th position ...it shows the error.
Because of already existing string contains index position at 3 ....after 4 position only we can insert the string*/
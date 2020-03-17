import java.lang.String;
class String8
{
public static void main(String args[])
{
StringBuffer sb1 = new StringBuffer("This is StringBuffer");
System.out.println(sb1);
        
sb1.append("This is a sample program");
System.out.println(sb1);


sb1.insert(21, "Object"); 
System.out.println(sb1);


sb1.replace(14, 20 , "Builder"); 
System.out.println(sb1);

sb1.reverse();
System.out.println(sb1);
}
}



class Stester5{
public static void main(String[] args) 
{
 String s1 = null; 
String s2 =null; 
if (s1 == s2) 
System.out.print("A"); 
if (s1.equals(s2))
 System.out.print("B");
}
 } 


/* Output : Nullpointer Exception
AException in thread "main" java.lang.NullPointerException
        at Stester5.main(Stester5.java:8) 	*/
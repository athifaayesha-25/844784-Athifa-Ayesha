import java.util.*;
class Inheritence2{
int id;
long number;
String name;
String Address;
 Inheritence2(int id1,long number1,String name1,String Address1)
{
 id=id1;
 number=number1;
 name=name1;
 Address=Address1;
}
 Inheritence2()
{
}
}
class Inher2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter ID");
int id=sc.nextInt();
System.out.println("enter Name");
String name=sc.next();
System.out.println("enter Address");
String address=sc.next();
System.out.println("enter Phone number");
long number=sc.nextLong();
System.out.println("Employee Details :  id: "+id+",  Name  :"+name+",  Address  :"+address+",  PhoneNumber  :"+number);  
}
}
import java.util.*;
class Person{
String fname;
String lname;
Person(String fname,String lname)
{
this.fname=fname;
this.lname=lname;
}
public String toString(){
return fname+lname;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter firstname");
String fname=sc.next();
System.out.println("enter lastname");
String lname=sc.next();
System.out.println(fname+lname);
}
}
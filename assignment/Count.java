import java.util.*;
class Count{
static int countObjects=0;
{
countObjects=countObjects+1;
}
public Count()
{
}
public Count(int n)
{
}
public Count(String s)
{
}
public Count(float f)
{
}
public static void main(String args[])
{
Count c1=new Count();
Count c2=new Count();
Count c3=new Count();
Count c4=new Count();
System.out.println("number of objects present in the class: "+Count.countObjects);
}
}


import java.util.*;

public class ListManager
{
public static void main(String args[])
{

List<String> List1 = new ArrayList<String>();
List<String> List2 = new ArrayList<String>();

List1.add("one");
List1.add("two");
List1.add("three");

List2.add("one");
List2.add("two");
List2.add("three");
List2.add("four");

System.out.println(List1);
System.out.println(List2);

removeElements(List1,List2);
System.out.println(List1);
}

public static List<String> removeElements(List<String>  List1,List<String> List2)
{
List<String> List3=new ArrayList<String>();
List1.retainAll(List2);
return List1;
}
}
import java.util.Scanner;
import java.util.ArrayList;
class ProblemStmt1
{
public static void main(String[] args)
{
    ArrayList<String> countries = new ArrayList<String>();

getName(countries);
System.out.println(countries);
getManyname(countries);
System.out.println(countries);
}
public static  ArrayList<String> getName(ArrayList<String>countries )
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the country names: ");
for(int i=1;i<=5;i++)
{
 countries.add(sc.next());
}
return countries ;
}
 public static  ArrayList<String> getManyname(ArrayList<String>countries )
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
 countries.add(sc.next());
// countries.add(2,"china");
}
return countries;
}
}

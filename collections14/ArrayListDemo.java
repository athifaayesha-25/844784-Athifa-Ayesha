import java.util.*;
class Country
{
String CountryName,CountryCapital;
int population;
public Country(String CountryName,String CountryCapital,int population)
{
this.CountryName=CountryName;
this.CountryCapital=CountryCapital;
this.population=population;
}
}
public class ArrayListDemo
{
public static void main(String args[])
{
List <Country> list=new ArrayList <Country>();
Country c1=new Country("India","Delhi",1000000000);
Country c2=new Country("China","Beijing",2000000000);
Country c3=new Country("Nepal","Bhutan",50000000);
list.add(c1);
list.add(c2);
list.add(c3);
//for(Country c:list)
//{
//System.out.println(c.CountryName+" "+c.CountryCapital+" "+c.population);
//}
Iterator itr=list.Iterator();
while(itr.hasNext())
{
System.out.println(itr.Next);
}
}
}

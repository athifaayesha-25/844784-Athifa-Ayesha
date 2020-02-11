class Creature { 
String getName() {
 return "Creature"; 
}
 }
 class Bird extends Creature 
{
 String getName() 
{
 return "Bird"; 
}
 boolean hasFeather()
{
 return true; 
}
 }
 public class Tester4
{
 public static void main(String[] args) 
{
 Creature c1=new Bird(); 
System.out.println(c1.getName()); 
System.out.println(c1.hasFeather()); 
Creature c2=new Creature();
 System.out.println(c2.getName()); 
//System.out.println(c2.hasFeather()); 
} }


/* Output:Tester4.java:23: error: cannot find symbol
System.out.println(c1.hasFeather());
                     ^
  symbol:   method hasFeather()
  location: variable c1 of type Creature
*/
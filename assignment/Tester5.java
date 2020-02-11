interface Colorable {

 }
 class Vehicle {
}
 class Car extends Vehicle implements Colorable 
{
}
 public class Tester5 
{
 public static void main(String[] args) throws Exception 
{
 Vehicle a = new Car();
 Colorable i = (Colorable) a; 
Vehicle b = new Vehicle(); 
Colorable j = (Colorable) b; } } 

/* OutPut:Exception in thread "main" java.lang.ClassCastException: Vehicle cannot be cast to Colorable
        at Tester5.main(Tester5.java:16)  */
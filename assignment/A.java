abstract class AirPlane 
{ 
abstract void fly(); 
void land()
 { 
 System.out.print("Landing.."); 
}
 }
abstract class AirJet extends AirPlane
 {
 AirJet() 
{
 super(); 
}
 void fly() 
{
 System.out.print("Flying.."); 
}
 abstract void land() ; 
} 
abstract class A{
public static void main(String args[])
{
AirPlane a=new AirPlane();
a.fly();
}
}



/* OutPut:  AirJet.java:9: error: AirJet is not abstract and does not override abstract method land() in AirJet
 class AirJet extends AirPlane */
class Creature { 
void grow()
 {
  }
} 
class Bird extends Creature { 
void fly() 
{ 
}
 } 
class Falcon extends Bird {
 void hunt() {
 }
 }
 public class Tester3 
{
 public static void main(String[] args) 
{ 
Creature c1 = new Bird(); 
Falcon c2 = new Falcon();
 Falcon c3=new Bird(); 
Falcon c4=new Creature(); 
Bird c5=new Falcon(); 
Bird c6=new Creature(); 
}
 }

/* OutPut:Compile time Error:
Tester3.java:21: error: incompatible types: Bird cannot be converted to Falcon
 Falcon c3=new Bird();
           ^
Tester3.java:22: error: incompatible types: Creature cannot be converted to Falcon
Falcon c4=new Creature();
          ^
Tester3.java:24: error: incompatible types: Creature cannot be converted to Bird
Bird c6=new Creature();
Parent class is not refer to the child class  */
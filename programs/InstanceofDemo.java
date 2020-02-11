class Parent{}
class child1 extends Parent{}
class child2 extends Parent{}
class InstanceofDemo{
public static void main(String args[]){
Parent p=new Parent();
child1 c1=new child1();
child2 c2=new child2();
System.out.println(c1 instanceof Parent);     //child c1=new Parent       Parent p=new child1
System.out.println(c2 instanceof Parent);    // child c2=new Parent       Parent p=new child2
System.out.println(p instanceof child1);      //Parent p=new child1           child1 c1=new Parent
System.out.println(p instanceof child2);     // Parent p=new child2           child2 c2=new Parent
p=c1;
System.out.Println(p instanceof child1);   // child c1=new child1            child1 c1=new child1
System.out.println(p instanceof child2);   //child c1=new child2             child2 c2=new child1
p=c2;
System.out.Println(p instanceof child1);   //child2 c2=new child1           child1 c1=new child2
System.out.println(p instanceof child2);   // child2 c2=new child2            child2 c2=new child2
}}
 
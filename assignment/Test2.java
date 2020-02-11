class A 
{
 private void printName()
{
System.out.println("Value-A"); 
} 
}
 class B extends A
{ 
 void printName()
{ 
System.out.println("Name-B"); 
} 
} 
class Test2
{
 public static void main (String[] args) 
{ 
B b = new B(); 
b.printName();
 } 
}

/* Output:if we the public we got the error......*/
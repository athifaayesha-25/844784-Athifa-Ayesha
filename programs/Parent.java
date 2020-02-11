class Parent{
void view(){
System.out.println("this is a parent class method");
}
}
class child extends Parent{
void view(){
System.out.println("this is a child class method");
}

public static void main(String args[]){
Parent ob=new Parent();
ob.view();
Parent ob1=new child();
ob1.view();
}
}
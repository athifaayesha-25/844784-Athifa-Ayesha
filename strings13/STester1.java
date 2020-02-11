class STester1{
public static void main(String[] args) {
 boolean stmt1 = "hello" == "hello";
System.out.println(stmt1); 
boolean stmt2 = new String("hello") == "hello"; 
System.out.println(stmt2);
boolean stmt3 = new String("hello") == new String("hello"); 
System.out.println(stmt3);
System.out.println(stmt1 && stmt2 || stmt3); 
}
}

/* Output:false   */
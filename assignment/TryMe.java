import java.util.*;
public class TryMe { 
Integer A; 
int a;  
public TryMe(int a) 
 { 
this.a = A + a;
 System.out.print(this.a);
 }
 public static void main(String args[]) 
{ 
Integer A = new Integer(10);
 TryMe t = new TryMe(A); 
} } 

/* Output : Null pointer Exception  */
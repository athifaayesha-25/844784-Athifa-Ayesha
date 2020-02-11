import java.util.*;
interface Foldable 
{ 
 public void fold() throws Exception ;
 } 
class Paper implements Foldable 
{
 public void fold() 
{
 System.out.print("Fold");
 }
 } 
public class Tester2
{ 
public static void main(String args [])throws Exception 
 { 
Foldable obj1 = new Paper(); 
obj1.fold()  ;
 Paper obj2 = new Paper();
obj2.fold();  
}
 }


/* Output: we must throws the Exception in main method then only we get the output      */
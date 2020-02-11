public class STester6 {
 public static void main(String[] args) {
 System.out.println("1");
 try {

 return; 
} 
catch (Exception e)
 {
 System.out.println("2"); 
} 
finally
 { 
System.out.println("3"); 
} 
System.out.println("4");
 } 
}
}


/*  Output: 1     4	
// what are the data we can kept in finally black 
that can compulsory excuted....even if it had exceptions	*/ 
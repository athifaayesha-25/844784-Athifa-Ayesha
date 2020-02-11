public class STester {
 public static void main(String[] args) 
{
 String stmt = "Java is a Programming Language"; 
//System.out.println(stmt);
for (String token : stmt.split("//s")) 
{
 System.out.print(token + " "); 
}
}
}

/* Out put: Java is a Programming Language   */
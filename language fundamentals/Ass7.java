import java.util.*;
public class Ass7{
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
{
System.out.println("Vowel");
}
else
{
System.out.println("consonant");
}
}
}

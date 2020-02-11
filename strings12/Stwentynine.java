// Java program to count vowels in a string 
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Stwentynine {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
System.out.println(display(s));
}
 
public static int display(String s) {
StringBuffer sb = new StringBuffer(s);
int k = 0;
LinkedHashSet<Character> l1 = new LinkedHashSet<Character>();
String s2 = sb.reverse().toString();
if (s2.equals(s)) {
String s3 = s2.toLowerCase();
 
for (int i = 0; i < s3.length(); i++) {
l1.add(s3.charAt(i));
}
Iterator<Character> it = l1.iterator();
while (it.hasNext()) {
char a = it.next();
 
if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
k++;
}
}
if (k >= 2)
return 1;
else
return -1;
 
}
 
}
 
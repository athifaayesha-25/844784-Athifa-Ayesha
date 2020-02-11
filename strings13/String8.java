import java.util.*;
class String8
{
public static String addChar(String str, char ch, int position) {
    StringBuilder sb = new StringBuilder(str);
    sb.insert(position, ch);
    return sb.toString();
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch=sc.next().charAt(0);
System.out.println("enter position");
int position=sc.nextInt();
System.out.println(addChar(str,ch,position));
}
}


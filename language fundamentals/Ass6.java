import java.util.*;
public class Ass6{
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n1=sc.nextInt();
int rem;
rem=n1%10;
System.out.println("last digit in name");
if(rem==0){
System.out.println("Zero");
}
else if(rem==1){
System.out.println("One");
}
else if(rem==2){
System.out.println("Two");
}
else if(rem==3){
System.out.println("Three");
}
else if(rem==4){
System.out.println("Four");
}
else if(rem==5){
System.out.println("Five");
}
else if(rem==6){
System.out.println("Six");
}
else if(rem==7){
System.out.println("Seven");
}
else if(rem==8){
System.out.println("Eight");
}
else if(rem==9){
System.out.println("Nine");
}
}
}

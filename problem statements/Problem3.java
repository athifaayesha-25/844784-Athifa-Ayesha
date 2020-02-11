import java.util.Scanner;
class Problem3{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int chocolate=sc.nextInt();
 int children=sc.nextInt();
 for(int i=1;i<=children;i++){
if(chocolate>=i){
chocolate=chocolate-i;
}
else{
int n=(children-(i-1));
System.out.println("remaining chocolate:" +chocolate);
System.out.println("children remaining:" +n);
break;
}
}
}
}


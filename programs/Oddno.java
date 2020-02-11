import java.util.Scanner;
class Oddno
{
public static void main(String args[])
{ 
    Scanner sc=new Scanner(System.in);
    int a,i;
    double b=0;
    for(i=1;i<=3;i++)
    {
        a=sc.nextInt();
        while(a%2!=0);
        {
            if(a%2==0)
            {
                b=b-0.5;
            }
            if(a<0)
            {
                b--;
            }
            else if(a%2!=0)
            {
                b++;
            }
            System.out.println(" the score is: "+b);
        }
       
          break;

      
    }
}
}
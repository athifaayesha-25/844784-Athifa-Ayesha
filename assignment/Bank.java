import java.util.*;
class Bank{
static String AcctNo;
static float balance;
static String AcctType; 
Bank(String AcctNo,float balance,String AcctType){
this.AcctNo=AcctNo;
this.balance=balance;
this.AcctType=AcctType;

}
public static void AccountDetails(float depositAmount,float withdrawAmount)
{
float acc=depositAmount-withdrawAmount;
System.out.println("Remaining Balance: "+acc);
}





public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);


Bank b1=new Bank(sc.nextLine(),sc.nextFloat(),sc.next());
System.out.println("Account number :"+b1.AcctNo+","+"Balance :"+b1.balance+","+"Account Type:"+b1.AcctType);
System.out.println("enter Deposit Amount");
float depositAmount=sc.nextFloat();
System.out.println("enter Withdraw Amount ");
float withdrawAmount=sc.nextFloat();

b1.AccountDetails(depositAmount,withdrawAmount);
}
}
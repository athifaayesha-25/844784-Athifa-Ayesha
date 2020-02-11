class Test2
{
public static void main(String args[])
{
int i,j=0;
aa:
for( i=1;i<=3;i++)
{
bb:
for( j=1;j<=3;j++)
{
if(i==2&&j==2)
 break aa;
}
System.out.println(i+" "+j);
}
}
}

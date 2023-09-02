import java.util.Scanner;
class perfectnum
{
public static void main(String args[])
{
int n;
System.out.println("Enter the perfect number:");
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();

for(int i=1;i<=n;i++)
{
int sum=0;
for(int j=1;j<i;j++)
{
if(i%j==0)
{
sum=sum+j;
}
}
if(sum==i)
{
System.out.println("perfect number"+i);
}
else
{
System.out.println("not a perfect number"+i);
}
}
}
}



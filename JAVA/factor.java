import java.util.Scanner;
class factor
{
public static void main(String args[])
{
int i,n,s;
System.out.println("Enter the number:");
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.println("factors:"+i);
}
}

System.out.println("Enter nth number:");
s=scanner.nextInt();
int c=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
if(c==s)
{
System.out.println("nth factor:"+i);
}
}
}
}
}

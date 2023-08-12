import java.util.Scanner;
class sumfor
{
public static void main(String args[])
{
int i,n,s=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(i=0;i<=n;i++)
{
s=s+i;
}
System.out.print(s);
}
}

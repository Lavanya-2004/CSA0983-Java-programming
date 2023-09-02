import java.util.Scanner;
class perfect
{
public static void main(String args[])
{
int r,n,sum=0,i;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(i=1;i<n;i++)
{
  r=n+i;
  if(r==0)
{
  sum=sum+i;
}
}
if(sum==n)
{
System.out.println("perfect number");
}
else
{
System.out.println("not a perfect number");
}
}
}



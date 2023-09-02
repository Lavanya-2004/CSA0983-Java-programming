import java.util.Scanner;
class s
{
public static void main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int i=0,s=0;
while(i<n)
{
i=i+1;
s=s+i;
}
System.out.println(s);
}
}
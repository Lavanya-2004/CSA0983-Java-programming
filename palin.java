import java.util.Scanner;
class palin
{
public static void main(String args[])
{
int n,rev=0,rem;
System.out.println("Enter the number:");
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println(rev);
}
}



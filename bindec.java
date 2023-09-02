import java.util.Scanner;
class bindec
{
public static void main(String args[])
{
int n,r,dec=0,i;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
while(n!=0)
{
r=n%10;
n=n/10;
dec=dec+r*Math.pow(2,i);
++i;
}
System.out.println(dec);
}
}
 
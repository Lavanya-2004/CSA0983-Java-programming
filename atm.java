import java.util.Scanner;
class atm
{
public static void main(String args[])
{
int a,b,c,d,e;
Scanner scanner=new Scanner(System.in);

System.out.println("enter the number of 2000 denomination:");
a=scanner.nextInt();


System.out.println("enter the number of 500 denomination:");
b=scanner.nextInt();


System.out.println("enter the number of 200 denomination:");
c=scanner.nextInt();


System.out.println("enter the number of 100 denomination:");
d=scanner.nextInt();


if(a!=2000||a!=500||a!=200||a!=100||b!=2000||b!=500||b!=200||b!=100||c!=2000||c!=500||c!=200||c!=100||
d!=2000||d!=500||d!=200||d!=100)
{
System.out.println("invalid");
}
else
{
e=((a*2000)+(b*500)+(c*200)+(d*100));
System.out.println("Total ATM balance:"+e);
}
}
}



import java.util.Scanner;
class days
{
public static void main(String args[])
{
int n;
System.out.println("Enter the number");
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();

int y=n/365;
int r=n%365;
int w=r/7;
int d=r%7;

System.out.println("years:"+y);
System.out.println("weeks:"+w);
System.out.println("days:"+d);


}
}

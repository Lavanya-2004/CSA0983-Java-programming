import java.util.Scanner;
class calculator
{
public static void main(String args[])
{
int n1,n2,n3,n4;

System.out.println("Enter the first number:");
Scanner scanner=new Scanner(System.in);
n1=scanner.nextInt();

System.out.println("Enter the second number:");
n2=scanner.nextInt();

n3=n1+n2;
System.out.println("The addition of two number:" +n3);

n4=n1-n2;
System.out.println("The  subtraction of two number:" +n4);



}
}

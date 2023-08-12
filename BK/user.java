import java.util.Scanner;
class user
{
public static void main(String args[])
{
String a,b;
Scanner scanner=new Scanner(System.in);
a=scanner.nextLine();
b=scanner.nextLine();
if(a.equals(b))
{
System.out.println("The username is valid");
}
else
{
System.out.println("The username is invalid");
}
}
}

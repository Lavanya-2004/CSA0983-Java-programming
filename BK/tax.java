import java.util.Scanner;
class tax
{
public static void  main(String args[])
{
int n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
if(n>500000)
{
System.out.println((n*30)/100);
}
else if(n>=300000 && n<500000)
{
System.out.println((n*20)/100);
}
else if(n>=150000 && n<300000);
{
System.out.println((n*10)/100);
}
else
{
System.out.println((n*0)/100);
}
}
}


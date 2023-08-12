import java.util.Scanner;
class pricom
{
public static void main(String args[])
{
int n,c=0,p=0;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[] array=new int[n];
for(i=0;i<n;i++)
{
array[i]=scanner.nextInt();
}
for(i=0;i<n;i++)
{
for(j=2;j<n;j++)
{
if(arr[i]%j==0)
{
System.out.println(arr[i]+"composite");
c=c+1;
break;
}
else
{
System.out.println(arr[j]+"prime");
p=p+1;
break;
}
}
}
System.out.println("composite":+c);
System.out.println("prime":+p);
}
}

import java.util.Scanner;
class minmax
{
public static void main(String args[])
{
int i,j,n;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int[] array=new int[n];
for(i=0;i<n;i++)
{
array[i]=scanner.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(array[i]<array[j])
{
int temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
System.out.println("min:"+array[0]);
System.out.println("max:"+array[n-1]);
System.out.println("sum:"+array[0]+array[n-1]);
System.out.println("diff:"+array[n-1]-array[0]);
}
}


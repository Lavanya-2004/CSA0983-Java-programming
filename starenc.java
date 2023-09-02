import java.util.Scanner;
class starenc
{
public static void main(String args[])
{
int i,j,nth,n;
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
System.out.println("nthvalue:");
nth=scanner.nextInt();

System.out.println(nth+"largest:"+array[n-nth]);
}
}



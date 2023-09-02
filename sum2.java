class sum2
{
   public static void main(String args[])
   {
   abc n1=new abc(1,2,3);
   abc n2=new abc(4,5,6);
   abc n3=new abc(4,2,1);
   abc n4=new abc(1,1,1);
   }
}
class abc
{
   int x,y,z;
   public abc(int a,int b,int c)
   {
    x=a;
    y=b;
    z=c;
    System.out.println(x+y+z);
   }
}



class singlex
{
public static void main(String args[])
{
int x=5,y=2,z=2;
try
{
int m=x/(y-z);
}
catch(ArithmeticException e)
{
System.out.println("Divide by zero");
}

finally
{
int m=x/y+z;
System.out.println(m);
}
}
}
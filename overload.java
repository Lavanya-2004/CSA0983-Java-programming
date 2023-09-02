class circle
{
double display(double radius1)
{
return 2*Math.PI*radius1;
}
double display(int radius1, double radius2)
{
return Math.PI*radius1*radius2;
}
}

class overload
{
public static void main(String args[])
{
circle m=new circle();
System.out.println("The area of circle:"+(m.display(0.5)));
System.out.println("The circumstance of circle:"+(m.display(5,0.4)));
}
}

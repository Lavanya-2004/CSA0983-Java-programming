class circle
{
public void display(double radius)
{
System.out.println("The area of circle:" +(Math.PI*radius*radius));
}
}
 
class circum 
{
public void display(double radius)
{
System.out.println("The circumstance of a circle:"+(2*Math.PI*radius));
}
}
  

class cc
{
public static void main(String args[])
{
double radius=0.04;
circum n=new circum();
n.display(radius);
circle m=new circle();
m.display(radius);
}
}

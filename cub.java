class rectangle
{
int l=10,b=20;
public void display()
{
System.out.println("The area of rectangle:"+l*b);
}
}

interface shape
{
public void display();
}

class cuboid extends rectangle implements shape
{
public void display2()
{
int l=5,b=7,h=8;
System.out.println("The area of cuboid:"+ 2*(l*b)+(b*h)+(h*l));
}
}

class cub
{
public static void main(String args[])
{
cuboid n=new cuboid();
n.display2();
rectangle m=new rectangle();
m.display();
}
}


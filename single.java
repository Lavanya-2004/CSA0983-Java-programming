class p
{
int x=5;
public void display()
{
System.out.println(x);
}
}

class c extends p
{
int y=10;
public void display1()
{
System.out.println(y);
}
}

class single
{
public static void main(String args[])
{
c n=new c();
n.display1();
n.display();
}
}
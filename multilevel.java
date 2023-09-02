class a
{
public void display()
{
System.out.println("parents");
}
}

class b extends a
{
public void display1()
{
System.out.println("child");
}
}

class c extends b
{
public void display2()
{
System.out.println("derived");
}
}

class multilevel
{
public static void main(String args[])
{
c n=new c();
n.display2();
n.display1();
n.display();
}
}
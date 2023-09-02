class a extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println(i);
}
}
}

class b extends Thread
{
public void run()
{
for(int j=0;j<=5;j++)
{
System.out.println(j);
}
}
}

class c extends Thread
{
public void run()
{
for(int k=0;k<=5;k++)
{
System.out.println(k);
}
}
}

class th
{
public static void main(String args[])
{
a n=new a();
n.start();
b m=new b();
m.start();
c u=new c();
u.start();
u.setPriority(Thread.MAX_PRIORITY);
}
}

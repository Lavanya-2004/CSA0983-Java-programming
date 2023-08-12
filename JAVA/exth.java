class a implements Runnable
{
public void run()
{
for( int i=0;i<=3;i++)
{
System.out.println(i);
}
}
}


class exth
{
public static void main(String args[])
{
a n=new a();
Thread t=new Thread(n);
t.start();
}
}


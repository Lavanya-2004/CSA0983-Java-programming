import java.awt.*;
class abc
{
public abc()
{
Frame f=new Frame("Lavanya");
f.setSize(200,200);
f.setVisible(true);
Panel p=new Panel("student");
f.add(p);
Label l1=new Label("Enter your name");
p.add(l1);

Label l2=new Label("Register number");
p.add(l2);

Label l3=new Label("Date of Birth");
p.add(l3);

Label l4=new Label("address");
p.add(l4);

Label l5=new Label("Phone number");
p.add(l5);

Label l6=new Label("Email");
p.add(l6);
}
}


class awt
{
public static void main(String args[])
{
abc y=new abc();
}
}




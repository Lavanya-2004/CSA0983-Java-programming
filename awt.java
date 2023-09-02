import java.awt.*;
class abc
{
public abc()
{
Frame f=new Frame("Lavanya");
f.setSize(350,300);
f.setVisible(true);
Panel p=new Panel();
f.add(p);

Label l1=new Label("Name:");
p.add(l1);
Button b1=new Button("Enter your name");
p.add(b1);




Label l2=new Label("Register number:");
p.add(l2);
Button b2=new Button("Enter your regno");
p.add(b2);



Label l3=new Label("Date of Birth:");
p.add(l3);
Button b3=new Button(" enter dob");
p.add(b3);

Label l4=new Label("address:");
p.add(l4);
Button b4=new Button(" enter add");
p.add(b4);

Label l5=new Label("Phone number:");
p.add(l5);
Button b5=new Button("enter phn");
p.add(b5);

Label l6=new Label("Email:");
p.add(l6);
Button b6=new Button("enter the mail");
p.add(b6);
}
}


class awt
{
public static void main(String args[])
{
abc y=new abc();
}
}




import java.awt.Color;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;
public class MyFrame extends Frame implements ActionListener {
    Button b1,b2,b3,b4,b5;
    TextField t1,t2;
    TextArea txt;
    public MyFrame(){
        setBackground(Color.cyan);
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("+");
        b2=new Button("-");
        b3=new Button("*");
        b4=new Button("/");
        b5=new Button("%");
        txt=new TextArea(5,20);
        add(t1);
        add(t2);
        add(b1);
        b1.addActionListener(this);
        b1.setBackground(Color.yellow);
        b1.setBounds(200,55,90,50);
        add(b2);
        b2.addActionListener(this);
        b2.setBackground(Color.yellow);
        b2.setBounds(200,65,90,50);
        add(b3);
        b3.addActionListener(this);
        b3.setBackground(Color.yellow);
        b3.setBounds(200,75,90,50);
        add(b4);
        b4.addActionListener(this);
        b4.setBackground(Color.yellow);
        b4.setBounds(200,85,90,50);
        add(b5);
        b5.addActionListener(this);
        b5.setBackground(Color.yellow);
        b5.setBounds(200, 95, 90, 50);
        add(txt);
    }
public void actionPerformed(ActionEvent e)
{
   String n1=t1.getText();
   String n2=t2.getText();  
   Integer i1=Integer.parseInt(n1);
   Integer i2=Integer.parseInt(n2);
   int n=0;
   String op=e.getActionCommand();
   if(op.equals("+"))
    n=i1+i2;
    if(op.equals("-"))
    n=i1-i2;
    if(op.equals("x"))
    n=i1*i2;
    if(op.equals("/"))
    n=i1/i2;
    if(op.equals("%"))
    n=i1%i2;
    String n3=String.valueOf(n);
    String exp=n1+" "+op+" "+n2+"="+n3;
    txt.insert(exp+"\n",0);
}

}    


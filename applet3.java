//7.6 WAP to add,multiplication & subtraction using applets

import java.applet.*;
import java.awt.*;
/*
<applet code="applet3.java" height=200 width=200>
</applet>*/
public class applet3 extends Applet
{
	Label l1,l2;
	TextField t1,t2;
	public void init()
	{
		l1=new Label("Number 1");
		l2=new Label("Number 2");
		t1=new TextField(10);
		t2=new TextField(10);
		t1.setText("0");
		t2.setText("0");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
	}
	public void paint(Graphics g)
	{
		int num1=0;
		int num2=0;
		int add,mul,sub;
		String s1,s2;
		try
		{
			s1=t1.getText();
			s2=t2.getText();
			num1=Integer.parseInt(s1);
			num2=Integer.parseInt(s2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		add=num1+num2;
		mul=num1*num2;
		sub=num1-num2;
		
		
		String str1="Addition of :"+String.valueOf(add);
		g.drawString(str1,100,100);
		String str2="Multiplication of :"+String.valueOf(mul);
		g.drawString(str2,100,120);
		String str3="Subtraction of :"+String.valueOf(sub);
		g.drawString(str1,100,140);		
	}
	public boolean action(Event e,Object ob)
	{
		repaint();
		return true;
	}
}
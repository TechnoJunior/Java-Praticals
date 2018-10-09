// 7.3 WAP to draw Rectangle,Oval & Lines using for loop

import java.applet.*;
import java.awt.*;
/*
<applet code="applet.java" height=200 width=200>
</applet>*/
public class applet extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=0;i<250;i++)
		{
			Color c1= new Color(173-i,26-i,230-i);
			g.setColor(c1);
			g.drawRect(250+i,100+i,100+i,100+i);
			g.drawOval(100+i,100+i,50+i,50+i);
			g.drawLine(50+i,20+i,10+i,10+i);
			g.drawString("Welcome to Java Applet",150,150);
		}
	}
}
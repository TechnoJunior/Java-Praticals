// WAP to draw a rectangle,oval,line,arc and text using applets
import java.applet.*;
import java.awt.*;
/*
<applet code="Draw.java" height=200 width=200>
</applet>*/
public class Draw extends Applet
{
	public void paint(Graphics g)
	{
		
		/*g.drawRect(20,20,40,60);
		g.drawOval(70,50,100,100);
		g.drawLine(150,200,250,300);
		g.drawString("Welcome to Java Applet",150,150);
		g.drawArc(90,200,50,60,0,-180);
		g.setColor(Color.BLUE);
		g.fillRect(500,500,150,200);
		g.setColor(Color.YELLOW);
		g.fillOval(190,190,270,280);*/
		for(int i=0;i<=1000;i++)
		{
			g.drawArc(i*70,i*50,40,60,0,-180);
		}
	}
}

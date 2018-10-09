//7.4WAP to display background color and font size
import java.applet.*;
import java.awt.*;
/*
<applet code="applet1.java" height=200 width=200>
</applet>*/
public class applet1 extends Applet
{
	public void init()
	{
		for(int i=0;i<250;i++)
		{
			setBackground(Color.BLUE);
			Font f = new Font("TIMESNEWROMAN",Font.BOLD|Font.ITALIC,40);
			setFont(f);
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("TechnoBoy",50,50);
	}
}
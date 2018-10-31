import java.awt.*;
import java.applet.*;
/*<applet code="font.java" height=200 widht=200></applet>*/
public class font extends Applet
{
	public void init()
	{
		setBackground(Color.RED);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to java",50,50);
	}
}
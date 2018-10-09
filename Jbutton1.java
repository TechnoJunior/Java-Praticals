//7.8 WAP to create Menu,Menu Bar and Menu Items using frame

import javax.swing.*;
import java.awt.*;
public class frame extends Frame
{
	public frame()
	{
		JFrame f= new JFrame();
		MenuBar mb=new MenuBar();
		f.setMenuBar(mb);
		//f.add(mb);
		Menu m1=new Menu("Movies");
		mb.add(m1);
		MenuItem mi1= new MenuItem("Globet of Fire");
		MenuItem mi2= new MenuItem("Infinity War");
		MenuItem mi3= new MenuItem("Ragnork");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		f.setTitle("Frame");
		f.setSize(200,200);
		f.setVisible(true);
		
		Menu m2=new Menu("Movies");
		mb.add(m2);
		MenuItem a1=new MenuItem("Harry");
		MenuItem a2=new MenuItem("Potter");
		m2.add(a1);
		m2.add(a2);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new frame();
	}
}
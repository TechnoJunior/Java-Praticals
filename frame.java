//7.8 WAP to create Menu,Menu Bar and Menu Items using frame

import javax.swing.*;
import java.awt.*;
public class frame extends Frame
{
	public frame()
	{
		//JFrame f= new JFrame("TechnoBoy");
		Frame f= new Frame("TechnoBoy");
		MenuBar mb=new MenuBar();
		f.setMenuBar(mb);
		//f.add(mb);
		Menu m1=new Menu("File");
		mb.add(m1);
		MenuItem mi1= new MenuItem("New");
		MenuItem mi2= new MenuItem("Open");
		MenuItem mi3= new MenuItem("Save");
		MenuItem mi4= new MenuItem("Save As");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		
		f.setTitle("Frame");
		f.setSize(200,200);
		f.setVisible(true);
		
		Menu m2=new Menu("Edit");
		mb.add(m2);
		MenuItem b1=new MenuItem("Cut");
		MenuItem b2=new MenuItem("Copy");
		MenuItem b3=new MenuItem("Paste");
		m2.add(b1);
		m2.add(b2);
		m2.add(b3);
		
		Menu m3=new Menu("Format");
		mb.add(m3);
		MenuItem c1=new MenuItem("Word Wrap");
		MenuItem c2=new MenuItem("Font..");
		m2.add(c1);
		m2.add(c2);
		
		Menu m4=new Menu("View");
		mb.add(m4);
		MenuItem d1=new MenuItem("Status bar");
		m2.add(d1);
		
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new frame();
	}
}
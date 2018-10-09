//7.10 WAP to create JComboBox
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="JComboBoxDemo.java" height=200 width=200></applet>
*/

public class JComboBoxDemo extends JApplet implements ItemListener
{
	JLabel l1;
	ImageIcon a,b,c;
	public void init()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		l1=new JLabel("Transformers");
		cp.add(l1);
		JComboBox jb=new JComboBox();
		jb.addItem("a1");
		jb.addItem("a2");
		jb.addItem("a3");
		jb.addItemListener(this);
		cp.add(jb);
		l1=new JLabel(new ImageIcon("a1.jpg"));
		cp.add(l1);
	}
	public void itemStateChanges(ItemEvent e)
	{
		String s=(String)e.getItem();
		l1.setIcon(new ImageIcon(s+".jpg"));
	}
}
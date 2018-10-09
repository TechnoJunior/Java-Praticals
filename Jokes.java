//7.9 WAP to create JButton using ActionListener

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Jokes
{
	JFrame f;
	public static void main(String args[])
	{
		Jokes j=new Jokes();
	}
	public Jokes()
	{
		f=new JFrame();
		JButton b=new JButton("Click Me");
		b.addActionListener(new myclick());
		f.add(b);
		f.setSize(200,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class myclick implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(f,"Happy Birthday Ankita!!!!");
		}
	}
}
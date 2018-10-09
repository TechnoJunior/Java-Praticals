//7.7 WAP  to create Buttons Using Grid Layout in JFrame

import javax.swing.*;
import java.awt.*;

public class Jbutton
{
	Jbutton()
	{
		JFrame f= new JFrame("TechnoBoy");
		JButton b1= new JButton("One");
		JButton b2= new JButton("Two");
		JButton b3= new JButton("Three");
		JButton b4= new JButton("Four");
		JButton b5= new JButton("Five");
		JButton b6= new JButton("Six");
		JButton b7= new JButton("Seven");
		JButton b8= new JButton("Eight");
		JButton b9= new JButton("Nine");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		
		f.setLayout(new GridLayout(3,3));
		f.setSize(200,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new Jbutton();
	}
}
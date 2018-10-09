//7.5 WAP to draw all components of AWT
import java.applet.*;
import java.awt.*;
/*
<applet code="applet2.java" height=200 width=400>
</applet>*/
public class applet2 extends Applet
{
	Button b1,b2;
	Label l1,l2;
	Checkbox c1,c2,r1,r2;
	CheckboxGroup rgb;
	Choice ch1,ch2;
	List i1,i2;
	TextArea a1,a2;
	TextField tf;
	
	public void init()
	{
		setBackground(Color.BLUE);
		b1 = new Button("OK");
		b2 = new Button("Submit");
		
		add(b1);
		add(b2);
		
		l1=new Label("Hello");
		l2=new Label("Bye Bye");
		add(l1);
		add(l2);
		
		c1=new Checkbox("Harry",true);
		c2=new Checkbox("Hermione",false);
		add(c1);
		add(c2);
		
		/*rgb=new CheckboxGroup();
		r1=new Checkbox("Male",true,rgb);
		r1=new Checkbox("Female",false,rgb);
		add(r1);
		add(r2);*/
		
		ch1=new Choice();
		ch1.add("Harry");
		ch1.add("Hermione");
		ch1.add("Ron");
		ch1.add("Voldemort");
		add(ch1);
		
		ch2=new Choice();
		ch2.add("Hero");
		ch2.add("Heroine");
		ch2.add("Side");
		ch2.add("Villan");
		add(ch2);
		
		i1=new List();
		i1.addItem("Harry Potter");
		i1.addItem("Lord of Rings");
		i1.addItem("POC");
		add(i1);		
		i2=new List();
		i2.addItem("Justin");
		i2.addItem("Shakira");
		add(i2);
		
		String s="Never Say Never!!!!";
		a1=new TextArea(s,10,30);
		a2=new TextArea(10,30);
		add(a1);
		add(a2);
		
		tf=new TextField(10);
		tf.setEchoChar('*');
		add(tf);
	}
}
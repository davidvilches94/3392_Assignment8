import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class ColorPanels extends JFrame 
{
	public ColorPanels()
	{
		setLayout(null);
		setSize (800, 400);
		setTitle("Color Panel");
		
		JPanel Mainpanel = new JPanel();
	    Mainpanel.setLayout(null);
	    Mainpanel.setSize(800,400);
	    Mainpanel.setBackground(Color.black);
		
		JPanel Leftpanel = new JPanel();
		JButton Redbutton = new JButton("RED");
		JLabel Redtext = new JLabel("RED");
		
		Redtext.setLocation(135,70);
		Redtext.setSize(40,20);
		Redtext.setForeground(Color.red);
		Redbutton.setLocation(100,260);
		Redbutton.setSize(100,50);
		Leftpanel.setLayout(null);
		Leftpanel.setSize(200,150);
		Leftpanel.setLocation(50,100);
		Leftpanel.setBackground(Color.RED);
		Mainpanel.add(Leftpanel);
		Mainpanel.add(Redbutton);
		Mainpanel.add(Redtext);
		
		JPanel Middlepanel = new JPanel();
		JButton Bluebutton = new JButton("BLUE");
		JLabel Bluetext = new JLabel("BLUE");
		
		Bluetext.setLocation(382,70);
		Bluetext.setSize(40,20);
		Bluetext.setForeground(Color.blue);
		Bluebutton.setLocation(350,260);
		Bluebutton.setSize(100,50);
		Middlepanel.setLayout(null);
		Middlepanel.setSize(200,150);
		Middlepanel.setLocation(300,100);
		Middlepanel.setBackground(Color.BLUE);
		Mainpanel.add(Middlepanel);
		Mainpanel.add(Bluebutton);
		Mainpanel.add(Bluetext);
		
		JPanel Rightpanel = new JPanel();
		JButton Yellowbutton = new JButton("YELLOW");
		JLabel Yellowtext = new JLabel("YELLOW");
		
		Yellowtext.setLocation(623,70);
		Yellowtext.setSize(50,20);
		Yellowtext.setForeground(Color.yellow);
		Yellowbutton.setLocation(600,260);
		Yellowbutton.setSize(100,50);
		Rightpanel.setLayout(null);
		Rightpanel.setSize(200,150);
		Rightpanel.setLocation(550,100);
		Rightpanel.setBackground(Color.YELLOW);
		Mainpanel.add(Rightpanel);
		Mainpanel.add(Yellowbutton);
		Mainpanel.add(Yellowtext);
		
		add(Mainpanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main (String [] args)
	{
		ColorPanels t = new ColorPanels();
		System.out.println(t.getContentPane().getSize());
	}
}
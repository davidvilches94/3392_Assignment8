import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Beeper extends JFrame 
{
	private JPanel panel;
	private JButton noiseButton;
	private final int WINDOW_WIDTH = 250;
	private final int WINDOW_HEIGHT = 80;
	
	public static int clicks = 0;
	
	public Beeper()
	{
		super("NoiseMaker");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	private void buildPanel()
	{
		
		noiseButton = new JButton("Make Noise");
		noiseButton.addActionListener(new NoiseButtonListener());
		panel = new JPanel();
		
		panel.add(noiseButton);
	}
	private class NoiseButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Toolkit.getDefaultToolkit().beep();
			
		    clicks++;
			
			System.out.println("Number of clicks: " +clicks);
		}
		
	}
	
	public static void main (String [] args)
	{
		new Beeper();
	}
}